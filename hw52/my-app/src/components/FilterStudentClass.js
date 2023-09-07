import React, { Component } from 'react';

class FilterStudentClass extends Component {
  state = {
    class_filter: 0
  }
  handleChange = (e) => {
    this.setState({
        class_filter:parseInt(e.target.value)
    })
    this.props.filter_by_class(parseInt(e.target.value));
  }
  render() {
    return (
      <div className='flex-container-header'>
        <span>filter student by number of class</span>
           <p>Filter: <input name="class" type="number" onChange={this.handleChange} 
              value={this.state.class_filter} placeholder="number of class" /></p>              
      </div>
    );
  }
}

export default FilterStudentClass;