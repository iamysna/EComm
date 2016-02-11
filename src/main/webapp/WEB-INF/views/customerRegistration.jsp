<!DOCTYPE html>

<%@taglib uri="http://www.springframework.org/tags/form"
prefix="form" %>
<%@include file="header.jsp" %>
<html>
<body>
<section id="body-section">
		<form action="customerRegistration" id="seller-registration-form" method="post">
			
			<div>
			
			<h2>${message}
			</h2>
			</div>
			
			<div>
				<p>Customer Registration</p>
			</div>
			<div id="sellerRegStatusDiv" style="color: red;font: bold;font-size: medium;">
			</div>
			<div id="form-wrapper">
				<div  id="user-details">
					<div>
						<input type="text" placeholder="User Name *" name="userName"  required="required"/>
						<small></small>
					</div>
					
					
					<div>
						<input type="text" placeholder="Email Id *" name="emailId" required="required" />
						<small></small>
					</div>
					<div>
						<input type="password" placeholder="Password *" name="password" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Age" name="age" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Contact Number1 (mobile) *" name="mobileNo1" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Contact Number2 (landline|mobile)" name="mobileNo2" required="required"/>
						<small></small>
					</div>
				</div>
				<div id="address-details">
					<div>
						<input type="text" placeholder="Address Line1 *" name="addressLine1" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Address Line2 *" name="addressLine2" required="required"/>
						<small></small>
					</div>
					
					<div>
						<input type="text" placeholder="City *" name="city" required="required"/>
						<small></small>
					</div>
					
					<div>
						<input type="text" placeholder="State *" name="state" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="Country *" name="country" required="required"/>
						<small></small>
					</div>
					<div>
						<input type="text" placeholder="ZipCode *" name="zipCode" required="required" />
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

</html>