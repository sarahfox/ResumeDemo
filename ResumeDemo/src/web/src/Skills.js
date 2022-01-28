import React from 'react';

import { Card } from 'antd';

class Skills extends React.Component {
	constructor(props) {
		super(props)
		this.state = {
			filteredSkills: this.filterSkills(props.skillList)
		}
	}

	filterSkills(skillList){
		// Don't show the suff I haven't touched for a decade or more
		return skillList.filter(function(skill){
			return skill.proficiency == "HIGH" || skill.proficiency == "MEDIUM";
		}).map(function(skill){ return skill.name;}).join(", ");
	}
	
	render() {
		return (
			<Card title="Skills">
				{this.state.filteredSkills}
			</Card>
		)
	};
}

export default Skills;
