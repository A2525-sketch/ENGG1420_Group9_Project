# 📱 Campus Manager App

## 👥 Team Members
- John McLean - JohnMclean040-star & VampireByte-Studio
- Aiden Adams - A2525-sketch
- Anas Elkeden - aelkeden
- Hariharan Shankar - HariharanShankar310
- Ruth Lal - idk-214
- Abdulrahman Hasan - ahasan-abdul

---

## 📌 Project Overview
 This application designed to streamline:
- 📅 Event management  
- 🏫 Booking  
- 👤 User management  
- ⏳ Waitlist handling  

The app allows students, guests and staff to efficiently interact with campus resources in one centralized platform.

---

## 🚀 Features

### 🔐 User Management
- User registration and login
- Role-based access (e.g., student, guest, staff)
- Profile addition
- User list

### 📅 Event Management
- Create, update, and delete events
- View upcoming campus events
- Edit info for events

### 🏫 Booking System
- See all Bookings
- Login feature too see which bookings you currently
- Cancel or add bookings to users profile

### ⏳ Waitlist Management
- Join waitlists for fully booked events/resources
- view your position in the queue
- automatically promote when avaliable slot is made

---
App Walkthrough

### Main

Launch app via MainApp.Java class within Intellj to start prototype demo.

This should open an Application that looks like this:

<img width="612" height="431" alt="image" src="https://github.com/user-attachments/assets/cc301f4f-f909-4f42-8424-4df0d5f33090" />

Once open you may click on any four events to demo each of the 4 features!

### Users

After clicking on Users button from MainApp it should open a new app that looks like this.

<img width="605" height="438" alt="image" src="https://github.com/user-attachments/assets/0c0fc86e-0c33-4d92-8748-ddc98058b41a" />

Once this is open the CSV reader will open users.csv from the data folder and add them to the observable list.

You may scroll down to see all users.

User Manager also has the Feature to add new users by pressing add new user you will see the follow pop ups, fill them out with the needed info and the users.csv file will update and add the new user to the list.

Ex.

<img width="600" height="425" alt="image" src="https://github.com/user-attachments/assets/b45a1445-154b-4f7e-a724-ef314d0a6b53" />
<img width="603" height="427" alt="image" src="https://github.com/user-attachments/assets/8c97292b-c8b5-46fd-9751-acd60827553d" />
<img width="600" height="428" alt="image" src="https://github.com/user-attachments/assets/faa04c05-4d6c-477b-9e85-869c20cbb0c5" />
<img width="608" height="431" alt="image" src="https://github.com/user-attachments/assets/5b8dfa4b-cdec-4892-8793-8c03a9479682" />
<img width="596" height="425" alt="image" src="https://github.com/user-attachments/assets/c4d2c470-1394-48b7-8ae4-a9a9b69e83ad" />
<img width="544" height="632" alt="image" src="https://github.com/user-attachments/assets/081d6b85-bdf8-4aa5-aef4-3a306af9f558" />


### Booking

After clicking on Users button from MainApp it should open a new app that looks like this.

<img width="597" height="427" alt="image" src="https://github.com/user-attachments/assets/b9a70ecb-23dc-43b2-930f-b5e06ec1b28f" />

Once this is open the CSV reader will open users.csv from the data folder and Read booking to add them to the observable list.


Booking Manager has 4 features shown at the bottom as buttons Login, Book, Cancel and Refresh

1. Login
   When Login is pressed it will open a popup to force the user to login, the other 3 buttons will not work unless the app is given a valid user ID to fetch the info.

User popup

<img width="598" height="426" alt="image" src="https://github.com/user-attachments/assets/233e63f1-3386-46b6-83da-88416b60bfaf" />

Display when invalid user id is entered

<img width="592" height="421" alt="image" src="https://github.com/user-attachments/assets/744b2e81-a285-41c5-80f3-fe2f81f564a4" />

Display when valid user id is entered

<img width="601" height="426" alt="image" src="https://github.com/user-attachments/assets/21bb4d6c-d26a-4c27-b9eb-828f9a09d5a2" />

By Pressing the Book Button you are able to create or edit a per user booking info and display your saved bookings (creates/edits csv in data folder)

<img width="599" height="460" alt="image" src="https://github.com/user-attachments/assets/2136d7da-901a-44ea-83a9-7fbcff6792a7" />


<img width="364" height="194" alt="image" src="https://github.com/user-attachments/assets/0f694627-b5f5-4bb9-9de1-78336bd68f2b" />


<img width="612" height="278" alt="image" src="https://github.com/user-attachments/assets/1cbc3b2e-f9ea-416f-a02d-d03ed505a02d" />

The Refresh button is working to reload in case of a bug or improper loading on start up and the Cancel button will remove the selected booking from the list and CSV file.













