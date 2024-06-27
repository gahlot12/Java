<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyWeatherApp</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/style.css">
<script>
    async function fetchWeatherByCoordinates() {
        const lat = document.getElementById('latitudeInput').value.trim();
        const lon = document.getElementById('longitudeInput').value.trim();
        
        if (lat === "" || lon === "") {
            alert("Please enter latitude and longitude.");
            return;
        }
        
        try {
            const url = "${pageContext.request.contextPath}/weatherData?lat=" + lat + "&lon=" + lon;
            const response = await fetch(url);
            
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            
            const data = await response.json();
            
            console.log(data);
            
            // Update UI with weather data
            updateWeatherUI(data);
        } catch (error) {
            console.error('Error fetching weather data:', error);
            alert('Error fetching weather data. Please try again later.');
        }
    }
    
    async function fetchWeatherByCityName() {
        const cityName = document.getElementById('cityNameInput').value.trim();
        
        if (cityName === "") {
            alert("Please enter a city name.");
            return;
        }
        
        try {
            const url = "${pageContext.request.contextPath}/weatherData?cityName=" + encodeURIComponent(cityName);
            const response = await fetch(url);
            
            if (!response.ok) {
                throw new Error('Network response was not ok');
            }
            
            const data = await response.json();
            
            console.log(data);
            
            // Update UI with weather data
            updateWeatherUI(data);
        } catch (error) {
            console.error('Error fetching weather data:', error);
            alert('Error fetching weather data. Please try again later.');
        }
    }
    
    function updateWeatherUI(data) {
        document.getElementById('cityName').textContent = data.name;
        document.getElementById('temperature').textContent = data.main.temp + "°C";
        document.getElementById('description').textContent = data.weather[0].description;
    }
    
</script>
</head>
<body>
    <div class="navbar">
        <div class="left">
            <img height="40px" width="120px" src="${pageContext.request.contextPath}/images/weatherApp.JPG" alt="MyWeatherApp">
        </div>
        <div class="right">
            <a href="register.jsp"><button>Register</button></a>
            <a href="login.jsp"><button>Login</button></a>
        </div>
    </div>
    
    <div class="LatLongSearch">
        <div class="search-container">
            <input id="latitudeInput" type="text" placeholder="Enter Latitude" spellcheck="false"/>
            <input id="longitudeInput" type="text" placeholder="Enter Longitude" spellcheck="false"/>
            <button onclick="fetchWeatherByCoordinates()">Search by Lat/Lon</button>
        </div>
    </div>
    
    <div class="CityNameSearch">
    	<div class="search-container">
    		<input id="cityNameInput" type="text" placeholder="Enter City Name" spellcheck="false" />
    		<button onclick="fetchWeatherByCityName()">Search by City Name</button>
    	</div>
    </div>
    
    <div class="weather-container">
        <h2>Weather in <span id="cityName"></span></h2>
        <p>Temperature: <span id="temperature"></span></p>
        <p>Description: <span id="description"></span></p>
    </div>
    
    
    <div class="BigCityWeather">
        <div class="weather-container">
            <h2>Weather in Bangalore</h2>
            <p>Temperature: <span id="temperatureBangalore"></span></p>
            <p>Description: <span id="descriptionBangalore"></span></p>
        </div>
    </div>
    
</body>
</html>
