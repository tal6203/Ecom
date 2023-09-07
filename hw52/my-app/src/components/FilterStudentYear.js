import React, { Component } from 'react';

class FilterStudentYear extends Component {
  state = {
    year_filter: 0
  }
  handleChange = (e) => {
    this.setState({
        year_filter:parseInt(e.target.value)
    })
    this.props.filter_by_year(parseInt(e.target.value));
  }
  render() {
    return (
      <div className='flex-container-header'>
        <span>filter student by year of birth (bigger equal than)</span>
           <p>Filter: <input name="year" type="number" onChange={this.handleChange} 
              value={this.state.year_filter} placeholder="year" /></p>
              
      </div>
    );
  }
}

export default FilterStudentYear;