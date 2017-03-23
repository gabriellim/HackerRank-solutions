SELECT SUM(City.Population) FROM City
INNER JOIN Country
WHERE City.CountryCode = Country.Code
AND Country.Continent = "Asia"
