This project is a Node.js application that provides a RESTful API for managing members' information. It includes functionalities such as retrieving members, adding new members, updating member details, and more.

Installations
npm
npm init
npm install
npm i express
npm i mongoose


running:
node main.js

Set up the database:

Make sure you have a compatible database system (e.g., MongoDB) installed and running.
Update the database configuration in the dataBase.js file to connect to your database.


BLL (Business Logic Layer)
The BLL (Business Logic Layer) module membersBll.js contains the following functions:

getAll(): Retrieves information for all members.
getMemberById(memberId): Retrieves information for a specific member by their ID.
getMemberthatNotVaccinatied(): Retrieves information for members who have not been vaccinated.
addMember(newMember): Adds a new member to the system.
addNewVaccinatedToMember(id, vaccinations): Adds a new vaccination record to an existing member.
activePatientsLastMonth(): Retrieves the number of active patients for each day in the last month.
uploadPicture(memberID, pictureData, contentType): Uploads a picture for a specific member.

Controller
The controller module membersController.js defines the following API endpoints:

GET /api/members/getAllMembers: Retrieves information for all members.
GET /api/members/getMemberById/:id: Retrieves information for a specific member by their ID.
GET /api/members/getactivePatientsLastMonth: Retrieves the number of active patients for each day in the last month.
GET /api/members/getMemberthatNotVaccinatied: Retrieves information for members who have not been vaccinated.
POST /api/members/addMember: Adds a new member to the system.
POST /api/members/addNewVaccinatedToMember/:id: Adds a new vaccination record to an existing member.
POST /api/members/uploadPicture/:id: Uploads a picture for a specific member.
Please make sure to update the information in the README, such as the project name, installation instructions, database schema, BLL functions, and API endpoints, to accurately reflect your project.


How to use?
to see that the functions actually work
I ran the API calls in POSTMAN
An automated testing tool that works on API calls to servers or web services
And it did return the correct data for each call




