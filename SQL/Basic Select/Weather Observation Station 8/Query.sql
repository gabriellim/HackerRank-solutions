SELECT DISTINCT City FROM STATION
WHERE (
    LOWER(City) LIKE "a%"
    OR LOWER(City) LIKE "e%"
    OR LOWER(City) LIKE "i%"
    OR LOWER(City) LIKE "o%"
    OR LOWER(City) LIKE "u%"
)
AND (
    LOWER(City) LIKE "%a"
    OR LOWER(City) LIKE "%e"
    OR LOWER(City) LIKE "%i"
    OR LOWER(City) LIKE "%o"
    OR LOWER(City) LIKE "%u"
)
