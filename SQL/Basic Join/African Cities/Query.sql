SELECT City.Name FROM City
INNER JOIN Country
WHERE City.CountryCode = Country.Code
AND Country.Continent = "Africa"
