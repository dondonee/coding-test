/* 1. 이름이 있는 동물의 아이디 */
-- MySQL, Oracle
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NOT NULL
ORDER BY ANIMAL_ID ASC;


/* 2. 강원도에 위치한 생산공장 목록 출력하기 */
SELECT FACTORY_ID, FACTORY_NAME, ADDRESS
FROM FOOD_FACTORY
WHERE ADDRESS LIKE '강원도%'
ORDER BY FACTORY_ID ASC;


/* 3. 아픈 동물 찾기 */
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION = 'Sick' //기본적으로 오라클은 case-sensitive, MySQL은 case-insensitive
ORDER BY ANIMAL_ID ASC;


/* 4. 어린 동물 찾기 */
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE INTAKE_CONDITION != 'Aged'
ORDER BY ANIMAL_ID ASC;


/* 5. 이름이 없는 동물의 아이디 */
SELECT ANIMAL_ID
FROM ANIMAL_INS
WHERE NAME IS NULL
ORDER BY ANIMAL_ID;


