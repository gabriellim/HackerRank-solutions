SELECT Country.Continent, FLOOR(AVG(City.Population)) FROM City
INNER JOIN Country
WHERE City.CountryCode = Country.Code
GROUP BY Country.Continent
