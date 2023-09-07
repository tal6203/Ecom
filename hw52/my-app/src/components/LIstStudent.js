import Student from './Student';
import React, { Component } from 'react';

class ListStudent extends Component {
  render() {
    return this.props.filter_by_year > 0 ?
      (
        <div>
          {
            this.props.Students.filter(_student => _student.year_of_birth <= this.props.filter_by_year).map(_student =>
              <Student id={_student.id} first_name={_student.first_name} last_name={_student.last_name}
                email={_student.email}
                year_of_birth={_student.year_of_birth}
                number_of_class={_student.number_of_class} key={_student.id} update={_student.update}
                img = {_student.img}
                delete_student={this.props.delete_student}
                start_update={this.props.start_update}
                finish_update={this.props.finish_update}
              />)
          }
        </div>
      ) : this.props.filter_by_class > 0 ?
        (
          this.props.Students.filter(_student => parseInt(_student.number_of_class) === this.props.filter_by_class).map(_student =>
            <Student id={_student.id} first_name={_student.first_name} last_name={_student.last_name}
              email={_student.email}
              year_of_birth={_student.year_of_birth}
              number_of_class={_student.number_of_class} key={_student.id} update={_student.update}
              img = {_student.img}
              delete_student={this.props.delete_student}
              start_update={this.props.start_update}
              finish_update={this.props.finish_update}
            />
          )
        ) :
        (
          <div>
            {
              this.props.Students.map(_student =>
                <Student id={_student.id} first_name={_student.first_name} last_name={_student.last_name}
                  email={_student.email}
                  year_of_birth={_student.year_of_birth}
                  number_of_class={_student.number_of_class} key={_student.id} update={_student.update}
                  img = {_student.img}
                  delete_student={this.props.delete_student}
                  start_update={this.props.start_update}
                  finish_update={this.props.finish_update}
                />)
            }
          </div>
        )



  }
}

export default ListStudent;