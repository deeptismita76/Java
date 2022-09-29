<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background:green">
<h1>Enter PM Details</h1>
<form action= "click" method="post">
Name : <input type="text" name="name">
</br>
Country : <select name="country">
				<option>--select--</option>
				<option>Afghanistan</option>
				<option>Albania</option>
				<option>Algeria</option>
				<option>Andorra</option>
				<option>Angola</option>
				<option>Antigua and Barbuda</option>
				<option>Argentina</option>
				<option>Armenia</option>
				<option>Australia</option>
				<option>Austria</option>
				<option>Austrian Empire*</option>
				<option>Azerbaijan</option>
				
				<option>Baden*</option>
				<option>Bahamas</option>
				<option>Bahrain</option>
				<option>Bangladesh</option>
				<option>Barbados</option>
				<option>Bavaria*</option>
				<option>Belarus</option>
				<option>Belgium</option>
				<option>Belize</option>
				<option>Benin (Dahomey)</option>
				<option>Bolivia</option>
				<option>Bosnia and Herzegovina</option>
				<option>Botswana</option>
				<option>Brazil</option>
				<option>Brunei</option>
				<option>Brunswick and Lüneburg</option>
				<option>Bulgaria</option>
				<option>Burkina Faso</option>
				<option>Burma</option>
				<option>Burundi</option>
				
				<option>Cabo Verde</option>
				<option>Cambodia</option>
				<option>Cameroon</option>
				<option>Canada</option>
				<option>Cayman Islands</option>
				<option>Central African Republic</option>
				<option>Central American Federation*</option>
				<option>Chad</option>
				<option>Chile</option>
				<option>China</option>
				<option>Colombia</option>
				<option>Comoros</option>
				<option>Congo Free State</option>
				<option>Costa Rica</option>
				<option>Cote d’Ivoire (Ivory Coast)</option>
				<option>Croatia</option>
				<option>Cuba</option>
				<option>Cyprus</option>
				<option>Czechia</option>
				<option>Czechoslovakia</option>
				
				<option>Democratic Republic of the Congo</option>
				<option>Denmark</option>
				<option>Djibouti</option>
				<option>Dominica</option>
				<option>Dominican Republic</option>
				<option>Duchy of Parma</option>
				
				<option>East Germany (German Democratic Republic)*</option>
				<option>Ecuador</option>
				<option>Egypt</option>
				<option>El Salvador</option>
				<option>Equatorial Guinea</option>
				<option>Eritrea</option>
				<option>Estonia</option>
				<option>Eswatini</option>
				<option>Ethiopia</option>
				
				<option>Federal Government of Germany (1848-49)*</option>
				<option>Fiji</option>
				<option>Finland</option>
				<option>France</option>
				
				<option>Gabon</option>
				<option>Gambia</option>
				<option>Georgia</option>
				<option>Germany</option>
				<option>Ghana</option>
				<option>Grand Duchy of Tuscany, The*</option>
				<option>Greece</option>
				<option>Grenada</option>
				<option>Guatemala</option>
				<option>Guinea</option>
				<option>Guinea-Bissau</option>
				<option>Guyana</option>
				
				<option>Haiti</option>
				<option>Hanover*</option>
				<option>Hanseatic Republics*</option>
				<option>Hawaii*</option>
				<option>Hesse*</option>
				<option>Holy See</option>
				<option>Honduras</option>
				<option>Hungary</option>
				
				<option>Iceland</option>
				<option>India</option>
				<option>Indonesia</option>
				<option>Iran</option>
				<option>Iraq</option>
				<option>Ireland</option>
				<option>Israel</option>
				<option>Italy</option>
				
				<option>Jamaica</option>
				<option>Japan</option>
				<option>Jordan</option>
				
				<option>Kazakhstan</option>
				<option>Kenya</option>
				<option>Kingdom of Serbia/Yugoslavia*</option>
				<option>Kiribati</option>
				<option>Korea</option>
				<option>Kosovo</option>
				<option>Kuwait</option>
				<option>Kyrgyzstan</option>
				
				<option>Laos</option>
				<option>Latvia</option>
				<option>Lebanon</option>
				<option>Lesotho</option>
				<option>Lew Chew (Loochoo)*</option>
				<option>Liberia</option>
				<option>Libya</option>
				<option>Liechtenstein</option>
				<option>Lithuania</option>
				<option>Luxembourg</option>
          </select>
</br>
Marriage Status :<input type="radio" name ="marry" id="married"/>
				<label for="married">Married</label>
                <input type="radio" name ="marry" id="married"/>
                <label for="married">Unmarried</label>
                
               
</br>
Party :
		<select name="party">
 			<option>--select--</option>
            <option>BJP</option>
            <option>BJD</option>
            <option>AAP</option>
            <option>Congress</option>
         </select>
</br>
Age : <input type="text" name="age">
</br>
Gender : <input type="radio" name ="gender" id="gend"/>
         <label for="gend">Male</label>
         <input type="radio" name ="gender" id="gend"/>
         <label for="gend">Female</label>
         <input type="radio" name ="gender" id="gend"/>
         <label for="gend">Other</label>
         
</br>
Period As : <input type="text" name="period"/>
</br>
Time Represented :
		<select name="time">
 			<option>--select--</option>
            <option>1</option>
            <option>2</option>
            <option>3</option>
            <option>4</option>
            <option>5</option>
            <option>6</option>
            <option>7</option>
            <option>8</option>
            <option>9</option>
            <option>10</option>
         </select>
</br>
<button type="submit">Save</button>
	

</form>
</body>
</html>