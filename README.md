1. Метод FirstSentence(StringBuffer text) розбиває текст на речення за допомогою регулярного виразу \\., що означає розподіл за точкою. Перший елемент з отриманого масиву речень повертається як результат.

<img width="743" alt="Знімок екрана 2024-11-15 о 14 19 17" src="https://github.com/user-attachments/assets/1628981d-ba9a-4c59-89ef-799cd02e9faa">

2. Метод WordsFirstSentence(StringBuffer text) витягує всі слова з першого речення. Він проходить по кожному символу першого речення і збирає слова, розділені пробілами.

<img width="662" alt="Знімок екрана 2024-11-15 о 14 22 28" src="https://github.com/user-attachments/assets/c24d6fc3-09df-4adb-b110-47cd1df2fc52">

3. Метод WordsSubsequent(StringBuffer text) збирає всі слова з кожного речення, починаючи з другого. Текст розбивається на речення, і кожне слово з кожного наступного речення додається до колекції.

<img width="753" alt="Знімок екрана 2024-11-15 о 14 23 22" src="https://github.com/user-attachments/assets/8ca27910-85d8-4c3f-a937-0ccf8f31d385">

4. Метод UniqueWords(Set<String> firstWords, Set<String> subsequentWords) порівнює всі слова з першого речення з усіма словами наступних речень, щоб знайти унікальні слова, які є лише в першому реченні.
<img width="804" alt="Знімок екрана 2024-11-15 о 14 24 09" src="https://github.com/user-attachments/assets/3dd81060-feb2-42fb-86d0-3b498a93d29d">

5. Головний клас текстом, для якого викликаються методи.

<img width="912" alt="Знімок екрана 2024-11-15 о 14 27 48" src="https://github.com/user-attachments/assets/8ca49c34-c820-4566-ab76-afb8ebc15599">

6. Приклад виводу результата програми

<img width="197" alt="Знімок екрана 2024-11-15 о 14 29 34" src="https://github.com/user-attachments/assets/68ec4057-fbc4-46b9-be69-58b036bc04f4">
