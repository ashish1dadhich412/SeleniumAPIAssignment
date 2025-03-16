# SeleniumAPIAssignment

Completed Tasks

Task 1: Automate File Upload using Selenium

We have successfully automated the file upload process using Selenium WebDriver on this website.

Steps Completed:

Launched the browser and navigated to the file upload page.

Located the file upload input field and uploaded a test file.

Clicked on the "Upload" button.

Verified the upload success message and ensured the correct filename was displayed.

Captured a screenshot of the uploaded file confirmation.

Task 2: Window Handles

We automated interactions with multiple windows using Selenium WebDriver.

Steps Completed:

Opened the webpage GlobalSQA.

Clicked the "Open New Window" link to open a new browser window.

Captured the title of the new window.

Switched back to the main window.

Verified the correct switching between windows.

Task 3: Handle iFrame

We successfully handled single iFrames on Automation Testing.

Steps Completed:

Launched the browser and navigated to the demo page.

Switched to the single frame, entered text into the input field, took a screenshot (single_frame.png), and switched back to the main content.

API Testing: DummyJSON Recipes API

We have successfully completed API testing tasks using Postman for DummyJSON Recipes API.

Tasks Completed:

Task 1: Fetch All Recipes

Sent a GET request to https://dummyjson.com/recipes.

Verified the response status (200 OK).

Extracted and displayed the first recipe’s title, ingredients, and instructions.

Task 2: Fetch a Single Recipe

Sent a GET request to https://dummyjson.com/recipes/1.

Verified the response structure and matched the returned ID with the request.

Task 3: Search Recipes by Name

Used the GET endpoint https://dummyjson.com/recipes/search?q=chicken.

Validated the response contained relevant search results.

Task 4: Add a New Recipe (POST Request)

Sent a POST request to https://dummyjson.com/recipes/add with new recipe data.

Verified the response contained the newly added recipe with an assigned ID.

Task 5: Update a Recipe (PUT Request)

Sent a PUT request to https://dummyjson.com/recipes/{id} to update a recipe’s name.

Validated that the response reflected the updated data.

Task 6: Delete a Recipe (DELETE Request)

Sent a DELETE request to https://dummyjson.com/recipes/{id}.

Verified the response confirmed the deletion.
