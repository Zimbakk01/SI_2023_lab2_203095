# Втора лабораториска вежба по Софтверско инженерство

# Кирил Зимбаковски, бр. на индекс 203095

# Control Flow Graph

![SI_Labs2](https://github.com/Zimbakk01/SI_2023_lab2_203095/assets/116515674/f182a7b0-4073-455f-b5d3-36cf95cfe4f4)

# Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10(2 за for циклусите и 8 со if), па цикломатската комплексност изнесува 11.

# Тест случаи според критериумот Every Branch
Според Every Branch критериумот, треба да направиме тест за секој можен пат, а тоа може да го направиме со 16 тест случаеви

# 1:
Влез: user = null
allUsers = []
Излезt: Mandatory information missing!

# 2:
Влез: user = new User(null, "password", "email")
allUsers = []
Излез: Mandatory information missing!

# 3:
Влез: user = new User("username", null, "email")
allUsers = []
Излез: Mandatory information missin

# 4: 
Влез: user = new User("username", "password", null)
allUsers = []
Излез: Mandatory information missing!

# 5: 
Влез: user = new User("username", "password", "email")
allUsers = []
Излез: true

# 6: 
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3]
Излез: true

# 7:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3] (каде што user1.getEmail() е еднаков со user.getEmail())
Излез: false

# 8:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3] (каде што user1.getUsername() е еднаков со user.getUsername())
Излез: false

# 9:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3]
Излез: true

# 10:
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: false

# 11:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3]
Излез: false

# 12: 
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3]
Излез: false

# 13: 
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3] 
Излез: true

# 14:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = []
Излез: true

# 15:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3]
Излез: true

# 16:
Влез: user = new User("username", "password", "email@gmail.com")
allUsers = [user1, user2, user3]
specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_{|}"
password = "password"
passwordLower = "password"
Излез: true

# Тест случаи според критериумот Multiple Condition

# 1:
Влез: user = null
user.getPassword() = "password"
user.getEmail() = "email"
Излез : Mandatory information missing!

# 2:
Влез: user = new User()
user.getPassword() = null
user.getEmail() = "email"
Излез: Mandatory information missing!

# 3:
Влез: user = new User()
user.getPassword() = "password"
user.getEmail() = null
Излез: Mandatory information missing!

# 4:
Влез: user = null
user.getPassword() = null
user.getEmail() = "email"
Излез: Mandatory information missing!

# 5:
Влез: user = null
user.getPassword() = "password"
user.getEmail() = null
Излез: Mandatory information missing!

# 6:
Влез: user = new User()
user.getPassword() = null
user.getEmail() = null
Излез: Mandatory information missing!

# 7:
Влез: user = null
user.getPassword() = null
user.getEmail() = null
Излез: Mandatory information missing!

# 8:
Влез: user = new User()
user.getPassword() = "password"
user.getEmail() = "email"
Излез: Функцијата ќе продолжи со извршување

# Објаснување на напишаните unit tests
Објаснето во јава класата


