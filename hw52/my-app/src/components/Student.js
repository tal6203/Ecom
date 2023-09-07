import React, { Component } from 'react';
import './Button.css';
import'./Card.css';


class Student extends Component {
    state = {
        student_from_input: {
            id: 0,
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
                [e.target.name]: e.target.value,
                id: this.props.id,
            }
        })
    }

    handleSubmit = (e) => {
        e.preventDefault();
        this.props.finish_update(this.state.student_from_input)

        this.setState({
            student_from_input: {
                id: 0,
                first_name: "",
                last_name: "",
                email: "",
                year_of_birth: 0,
                number_of_class: 0,
                img:""
            }
        })
    }

    render() {
        const { id, first_name, last_name, email, year_of_birth, number_of_class, img } = this.props
        return !this.props.update ? (
            <div className='card' key={id}>
                <p><img style={{ verticalAlign: 'middel', width: '50px', height: '50px', borderRadius: '50%' }} src={img}></img></p>
                <p>first name: {first_name}</p>
                <p>last name: {last_name}</p>
                <p>email: {email}</p>
                <p>year of birth: {year_of_birth}</p>
                <p>number of class: {number_of_class}</p>
                <button className="button" style={{ background: '#f44336' }} onClick={() => this.props.delete_student(id)}>X</button>
                &nbsp;
                <button className="button" style={{ background:'#008CBA' }} onClick={() => this.props.start_update(id)}>U</button>
                <hr />
            </div>
        ) : (
            <div key={id}>
                <form onSubmit={this.handleSubmit}>
                    <p>first name: <input name="first_name" type="text" onChange={this.handleChange}
                        placeholder="first name" required /></p>
                    <p>last name: <input name="last_name" type="text" onChange={this.handleChange}
                        placeholder="last name" required /></p>
                    <p>email:  <input name="email" type="email" onChange={this.handleChange}
                        placeholder="email" required /></p>
                    <p>year_of_birth: <input name="year_of_birth" type="number" onChange={this.handleChange}
                        placeholder="year of birth" required /></p>
                    <p>number_of_class: <input name="number_of_class" type="number" onChange={this.handleChange}
                        placeholder="number of class" required /></p>
                    <p><input type="file" name="img" onChange={this.handleChange}
                        accept="image/png, image/jpeg" /></p>
                    <button className="button" style={{ background: '#f44336' }} onClick={() => this.props.delete_student(id)}>X</button>
                    &nbsp;
                    <button className="button" style={{ background: '#4CAF50' }} type="submit" >Done</button>
                </form>
                <hr />
            </div>

        )
    }
}

export default Student;