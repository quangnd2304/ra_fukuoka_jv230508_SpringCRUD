package com.ra.controller;

import com.ra.model.Student;
import com.ra.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
//map controller với đường dẫn URL
@RequestMapping(value = "/studentController")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping(value = "/getAll")
    public ModelAndView getAllStudent() {
        //Khởi tạo đối tượng ModelAndView --> định nghĩa trang jsp được trả về sau khi thực hiện xong
        ModelAndView mav = new ModelAndView("students");
        //Gọi sang service lấy listStudent
        List<Student> listStudents = studentService.getAllStudent();
        //add listStudents vào mav để chuyển sang view hiển thị dữ liệu
        mav.addObject("listStudents", listStudents);
        return mav;
    }

    @GetMapping(value = "/initCreate")
    public String initCreateStudent(ModelMap modelMap) {
        //Khởi tạo đối tượng student chứa thông tin sinh viên cần thêm mới và map nó lên form trang newStudent.jsp
        Student studentNew = new Student();
        //add vào modelMap
        modelMap.addAttribute("studentNew");
        return "newStudent";
    }

    //Thêm mới sinh viên
    @PostMapping(value = "/create")
//    public String createStudent(@ModelAttribute("studentNew") Student student){
    public String createStudent(Student studentNew) {
        //Thực hiện gọi sang service thực hiện thêm mới
        boolean result = studentService.createStudent(studentNew);
        if (result){
            return "redirect:getAll";
        }else{
            return "error";
        }
    }
}
