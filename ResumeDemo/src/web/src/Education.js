import React from 'react';

import { Card } from 'antd';

function Education(props) {
	return (
		<div className="education">
		{(
			props.education.map((school) => {
				return (
					<Card title={school.schoolName}>
						<div className="degrees">{school.degrees.join(", ")}</div>
						{school.majors && 
						<div className="majors">Majors: {school.majors.join(", ")}</div>
						}
						{school.minors && 
						<div className="minors">Minors: {school.minors.join(", ")}</div>
						}
						{school.awards && 
						<div className="awards">Awards: {school.awards.join(", ")}</div>
						}
					</Card>
				)
			}
		))}
		</div>
	);
}

export default Education;
