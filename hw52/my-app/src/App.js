import "./App.css";
import React, { Component } from 'react';
import ListStudent from "./components/LIstStudent";
import AddStudent from "./components/AddStudent";
import FilterStudentYear from "./components/FilterStudentYear";
import FilterStudentClass from "./components/FilterStudentClass";
import imgMam from "./img/man-user.png"
import imgWoman from "./img/woman-user.jpg"


class App extends Component {
  static my_students_seq = 3;
  state = {
    my_students: [
      { id: 1, first_name: "Tal", last_name: "Abutbul", email: "tal6203@gmail.com", year_of_birth: 1997, number_of_class: 5, update: false, img: imgMam },
      { id: 2, first_name: "Eden", last_name: "Alon", email: "eden632@gmail.com", year_of_birth: 1995, number_of_class: 3, update: false, img: imgWoman },
      { id: 3, first_name: "Yaniv", last_name: "cohen", email: "yaniv45@gmail.com", year_of_birth: 2000, number_of_class: 7, update: false, img: imgMam }
    ],
    filter_by_year: 0,
    filter_by_class: 0
  }

  addStudent = student => {
    const new_student = [...this.state.my_students, { ...student, img : imgMam == "./img/man-user" ? imgMam :imgWoman = "./img/woman-user", id: ++App.my_students_seq }]
    this.setState({
      my_students: new_student
    })
  }

  filterByYear = year => {
    this.setState({
      filter_by_year: year
    })
  }

  filterByClass = number_class => {
    this.setState({
      filter_by_class: number_class
    })
  }

  deleteStudent = _id => {
    const new_students = this.state.my_students.filter(student => student.id !== _id)
    this.setState({
      my_students: new_students
    })
  }

  startUpdate = _id => {
    const new_students = this.state.my_students.map(student => _id === student.id ?
      { ...student, update: true } : { ...student, update: false })
    this.setState({
      my_students: new_students
    })
  }

  finishUpdate = new_student => {
    const index = this.state.my_students.findIndex(student => new_student.id == student.id);
    console.log(new_student.img)
    this.state.my_students[index] = new_student;
    const newStudents = this.state.my_students.map(student => new_student > 0 ? { ...student, update: false } :
      { ...student, update: false })

    this.setState({
      my_students: newStudents
    })
  }
  render() {
    return (
      <div>
        <header className="App-header">
          <h1>My Students</h1>
          <AddStudent add_student={this.addStudent} />
          <div className="flex-container-header">
            <FilterStudentYear filter_by_year={this.filterByYear} />
            <FilterStudentClass filter_by_class={this.filterByClass} />
          </div>
          <div className="flex-container-body">
            <ListStudent Students={this.state.my_students} filter_by_year={this.state.filter_by_year}
              filter_by_class={this.state.filter_by_class} delete_student={this.deleteStudent}
              start_update={this.startUpdate}
              finish_update={this.finishUpdate}
            />
          </div>
        </header>
      </div>
    );
  }
}

export default App;