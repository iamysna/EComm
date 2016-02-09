<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form"
prefix="form" %>
<%@include file="header.jsp" %>
<html>
<body>
<section id="body-section">
		<form action="customerRegistration" id="seller-registration-form" method="post">
			<div>
				<p>Seller Registration</p>
			</div>
			<div id="sellerRegStatusDiv" style="color: red;font: bold;font-size: medium;">
			</div>
			<div id="form-wrapper">
				<div  id="user-details">
					<div>
						<input type="text" placeholder="User Name *" id="userName"  required="required"/>
						<small></small>
					</div>
					
					
					<div>
						<input type="text" placeholder="Email Id *" id="emailId" required="required" />
						<small></small>
					</div>
					<div>
						<input type="password" placeholder="Password *" id="password" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Age" id="age" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Contact Number1 (mobile) *" id="mobileNo1" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Contact Number2 (landline|mobile)" id="mobileNo2" required="required"/>
						<small></small>
					</div>
				</div>
				<div id="address-details">
					<div>
						<input type="text" placeholder="Address Line1 *" id="addressLine1" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Address Line2 *" id="addressLine2" required="required"/>
						<small></small>
					</div>
					
					<div>
						<input type="text" placeholder="City *" id="city" required="required"/>
						<small></small>
					</div>
					
					<div>
						<input type="text" placeholder="State *" id="state" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Country *" id="country" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="ZipCode *" id="zipCode" required="required" />
						<small></small>
					</div>
					<div>
						<span>existing seller..?<a href="#">Login</a></span>
						<input type="submit" value="Signup" id="submit-button"/>
						
					</div>
				</div>
			</div>
		</form>
	</section>



</body>
t>
</html>