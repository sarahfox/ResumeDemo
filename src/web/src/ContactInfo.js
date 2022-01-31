import React from 'react';

import './ContactInfo.css';

import { Row, Col } from 'antd';

function ContactInfo(props) {
	return (
		<Row className="contactInfo">
			<Col span={12}>
				<div className="name">
					{props.info.name}
				</div>
				<div className="address">
					{props.info.address}
				</div>
			</Col>
			<Col span={12}>
				<div className="email">
					{props.info.email}
				</div>
				<div className="phones">
					{(
						props.info.phones.map((phone) => {
							return (
								<div className="phone">{phone.number}</div>
							)
						}
					))}
				</div>
			</Col>
		</Row>
	);
}

export default ContactInfo;
