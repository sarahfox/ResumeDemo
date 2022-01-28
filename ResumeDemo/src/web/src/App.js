import React from 'react';

import 'antd/dist/antd.css';
import './App.css';

import ContactInfo from './ContactInfo.js';
import Education from './Education.js';
import Skills from './Skills.js';
import Jobs from './Jobs.js';
import { Spin } from 'antd';

let resume = require('./resumeData.json');

class App extends React.Component {
	constructor(props) {
		super(props)
		this.state = {
			resume: resume,
			DataIsLoaded: true
		}
	}

/* Uncomment once the backend is working
	componentDidMount() {
		fetch(
			"http://localhost:8080/api/resume")
            .then((res) => res.json())
            .then((json) => {
                this.setState({
                    resume: json,
                    DataIsLoaded: true
                });
            })
	}
*/

	render() {
		// Show a loading state
		if (!this.state.DataIsLoaded){
			return (
				<div className="app">
					<Spin tip="Loading..."/>
				</div>
			)
		}
		
		// If we've got the data, show the resume
		return (
			<div className="app">
				<ContactInfo info={this.state.resume.contactInfo} />
				<Education education={this.state.resume.education}/>
				<Skills skillList={this.state.resume.skills}/>
				<Jobs jobList={this.state.resume.jobs} />
			</div>
		)
	};
}
export default App;