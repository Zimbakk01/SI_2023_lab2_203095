# Втора лабораториска вежба по Софтверско инженерство

#Кирил Зимбаковски, бр. на индекс 203095

# Control Flow Graph

![SI_Labs2](https://github.com/Zimbakk01/SI_2023_lab2_203095/assets/116515674/f182a7b0-4073-455f-b5d3-36cf95cfe4f4)

# Цикломатска комплексност

Цикломатската комплексност на овој код е 11, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=10(2 за for циклусите и 8 со if), па цикломатската комплексност изнесува 11.

# Тест случаи според критериумот Every Branch
Според Every Branch критериумот, треба да направиме тест за секој можен пат, а тоа може да го направиме со 16 тест случаеви

Тест случај 1:  го проверува случајот кога корисникот  е null.
Влез: user = null
allUsers = []
Излезt: Mandatory information missing!

Тест случај 2: го проверува случајот кога името на корисникот  е null.
Влез: user = new User(null, "password", "email")
allUsers = []
Излез: Mandatory information missing!

Тест случај 3: го проверува случајот кога лозинката на корисникот  е null.
Влез: user = new User("username", null, "email")
allUsers = []
Излез: Mandatory information missing!

Тест случај 4: го проверува случајот кога емаилот на корисникот е null.
Влез: user = new User("username", "password", null)
allUsers = []
Излез: Mandatory information missing!

Тест случај 5: Овој тест случај проверува враќа true кога сите задолжителни информации се внесени и листата е празна.
Влез: user = new User("username", "password", "email")
allUsers = []
Излез: true

Тест случај 6: Овој тест случај проверува дали  true кога  задолжителните информации се внесени и корисникот има различен е-маил од останатите во листата.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: true

Тест случај 7: Овој тест случај проверува дали враќа false кога внесениот е-маил на корисникот  е ист со е-маилот на некој од корисниците во листата.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3] (каде што user1.getEmail() е еднаков со user.getEmail())
Излез: false

Тест случај 8: Овој тест случај проверува дали враќа false кога внесеното корисничко име на корисникот (user.getUsername()) е исто со корисничкото име на некој од корисниците во листата allUsers.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3] (каде што user1.getUsername() е еднаков со user.getUsername())
Излез: false

Тест случај 9: Овој тест случај проверува дали  враќа true кога внесениот е-маил и корисничкото име на корисникот не се исти со ниту еден од корисниците во листата allUsers.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: true

Тест случај 10: Овој тест случај проверува дали враќа false кога корисничкото име е дел од лозинката на корисникот.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: false

Тест случај 11: Овој тест случај проверува дали враќа false кога должината на лозинката е помала од 8 карактери.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: false

Тест случај 12: Овој тест случај проверува дали враќа false кога лозинката на корисникот не содржи празно место.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: false

Тест случај 13: Овој тест случај проверува дали враќа true кога корисникот нема исто име и е-маил со ниту еден од корисниците во листата.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3] 
Излез: true

Тест случај 14: Овој тест случај проверува дали враќа true кога имаме  празна листа, без корисници.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = []
Излез: true

Тест случај 15: Овој тест случај проверува дали враќа true кога лозинката на корисникот содржи барем еден специјален карактер.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
Излез: true

Тест случај 16: Овој тест случај проверува дали враќа true кога лозинката на корисникот не содржи ниту еден специјален карактер, ниту корисничкото име  како дел од неа.
Влез: user = new User("username", "password", "valid_email@gmail.com")
allUsers = [user1, user2, user3]
specialCharacters = "!#$%&'()*+,-./:;<=>?@[]^_{|}"
password = "password"
passwordLower = "password"
Излез: true

# Тест случаи според критериумот Multiple Condition

Тест случај 1:
Влез: user = null
user.getPassword() = "password"
user.getEmail() = "email"
Излез : Mandatory information missing!

Тест случај 2:
Влез: user = new User()
user.getPassword() = null
user.getEmail() = "email"
Излез: Mandatory information missing!

Тест случај 3:
Влез: user = new User()
user.getPassword() = "password"
user.getEmail() = null
Излез: Mandatory information missing!

Тест случај 4:
Влез: user = null
user.getPassword() = null
user.getEmail() = "email"
Излез: Mandatory information missing!

Тест случај 5:
Влез: user = null
user.getPassword() = "password"
user.getEmail() = null
Излез: Mandatory information missing!

Тест случај 6:
Влез: user = new User()
user.getPassword() = null
user.getEmail() = null
Излез: Mandatory information missing!

Тест случај 7:
Влез: user = null
user.getPassword() = null
user.getEmail() = null
Излез: Mandatory information missing!

Тест случај 8:
Влез: user = new User()
user.getPassword() = "password"
user.getEmail() = "email"
Излез: Функцијата ќе продолжи со извршување

# Објаснување на напишаните unit tests
Објаснето во јава класата


