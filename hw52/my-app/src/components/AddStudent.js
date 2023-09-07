import React, { Component } from 'react';
import './Button.css';

class AddStudent extends Component {
  state = {
    student_from_input: {
      first_name: "",
      last_name: "",
      email: "",
      year_of_birth: 0,
      number_of_class: 0,
      img : ""
    }
  }
  handleChange = (e) => {
    this.setState({
      student_from_input: {
        ...this.state.student_from_input,
        [e.target.name]: e.target.value
      }
    })

  }
  handleSubmit = (e) => {
    e.preventDefault();
    this.props.add_student(this.state.student_from_input)
    this.setState({
      student_from_input: {
        first_name: "",
        last_name: "",
        email: "",
        year_of_birth: 0,
        number_of_class: 0,
        img: ""
      }
    })
  }
  render() {
    return (
      <div>
        <h2>Add New Student</h2>
        <form onSubmit={this.handleSubmit}>
          <p>first name: <input name="first_name" type="text" onChange={this.handleChange}
            value={this.state.student_from_input.first_name} placeholder="first name" required /></p>
          <p>last name: <input name="last_name" type="text" onChange={this.handleChange}
            value={this.state.student_from_input.last_name} placeholder="last name" required /></p>
          <p>email:  <input name="email" type="email" onChange={this.handleChange}
          value={this.state.student_from_input.email} placeholder="email" required /></p>
          <p>year_of_birth: <input name="year_of_birth" type="number" onChange={this.handleChange}
            value={this.state.student_from_input.year_of_birth} placeholder="year of birth" required /></p>
            <p>number_of_class: <input name="number_of_class" type="number" onChange={this.handleChange}
            value={this.state.student_from_input.number_of_class} placeholder="number of class" required /></p>
            <p><input type="file" name="img"
            accept="image/png, image/jpeg"/></p>
          <button className="button" style={{ background:'#008CBA' }} type="submit">Add Student</button>
        </form>
      </div>
    )
  }
}


export default AddStudent;