import React from 'react';

import './Jobs.css';

import { Card } from 'antd';

function Jobs(props) {
	return (
		<div className="jobs">
		{(
			props.jobList.map((job) => {
				return (
					<Card>
						<div className="dates">{job.dates}</div>
						<div className="employer">{job.employer}</div>
						{job.titles && 
						<div className="title">{job.titles.join("/")}</div>
						}
						{job.tasks &&
							<ul>
								{(
									job.tasks.map((task) => {
										return (<li>{task}</li>)
									})
								)}
							</ul>
						}
					</Card>
				)
			}
		))}
		</div>
	);
}

export default Jobs;
