package ru.itmo.my_quiz_app.constants

import ru.itmo.my_quiz_app.Questions
import ru.itmo.my_quiz_app.R

object Data {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestionsAndroid(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()
        // 1
        val que1 = Questions(
            1, "Единица измерения для изменения размера элементов:",
            R.drawable.android_question,
            "dp", "px",
            "pt", "sp", 1
        )
        questionsList.add(que1)
        // 2
        val que2 = Questions(
            2, "Для чего используется система Gradle?",
            R.drawable.android_question,
            "Для настройки интерфейса программы Android Studio", "Для редактирования настроек проекта в режиме реального времени",
            "Для компиляции, построения и упаковки приложений и библиотек", "Нет правильного ответа", 3
        )
        questionsList.add(que2)

        // 3
        val que3 = Questions(
            3, "Какой метод запускает новый экземпляр компонента Activity?",
            R.drawable.android_question,
            "startMainActivity()", "startService()",
            "startIntent()", "startActivity()", 4
        )
        questionsList.add(que3)

        // 4
        val que4 = Questions(
            4, "Какое значение visibility нужно указать, чтобы View не отрисовывалась, но содержалась в разметке?",
            R.drawable.android_question,
            "visible", "invisible",
            "hidden", "gone", 2
        )
        questionsList.add(que4)

        // 5
        val que5 = Questions(
            5, "Какие веса нужно расставить на View внутри LinearLayout, чтобы они заняли 25%, 30% и 45% соответственно?",
            R.drawable.android_question,
            "6, 7, 9", "3, 4, 5",
            "5, 6, 9", "4, 5, 7", 3
        )
        questionsList.add(que5)

        // 6
        val que6 = Questions(
            6, "С помощью какого атрибута можно выравнивать дочерние элементы по центру?",
            R.drawable.android_question,
            "gravity = “center”", "layout_below = “center”",
            "orientation = “center”", "layout_gravity = “center”", 1
        )
        questionsList.add(que6)

        // 7
        val que7 = Questions(
            7, "Что значит атрибут hint в представлении EditText?",
            R.drawable.android_question,
            "жирный шрифт", "подчеркнутый текст",
            "подсказка для ввода текста", "определение текста", 3
        )
        questionsList.add(que7)

        // 8
        val que8 = Questions(
            8, "Назовите значение у атрибута inputType EditText, который автоматически исправляет вводимый текст:",
            R.drawable.android_question,
            "textWordCorrect", "textCorrect",
            "textCapWords", "textAutoCorrect", 4
        )
        questionsList.add(que8)

        // 9
        val que9 = Questions(
            9, "Назовите атрибут у ImageView, который определяет путь для загрузки изображений:",
            R.drawable.android_question,
            "source", "src",
            "scr", "path", 2
        )
        questionsList.add(que9)

        // 10
        val que10 = Questions(
            10, "Какое значение layout_height нужно указать, чтобы View было таким же по ширине, что и контейнер, в котором он находится?",
            R.drawable.android_question,
            "match_parent", "wrap_content",
            "350dp", "wrap_parent", 1
        )
        questionsList.add(que10)

        // 11
        //generate auto
        val que11 = Questions(
            11, "Платформа Андроид основывается на операционной системе:",
            R.drawable.android_question,
            "Linux", "MAC",
            "Unix", "Windows CE", 1
        )
        questionsList.add(que11)

        val que12 = Questions(
            12, "Ядро какой операционной системы использовалось в качестве базы для ОС Android?",
            R.drawable.android_question,
            "Linux", "OS/2",
            "Mac OS", "Windows", 1
        )
        questionsList.add(que12)
        val que13 = Questions(
            13, "Какой движок баз данных используется в ОС Android?",
            R.drawable.android_question,
            "DBM", "SQLite",
            "InnoDB", "MyISAM", 2
        )
        questionsList.add(que13)
        val que14 = Questions(
            14, "Какой компонент архитектуры Android позволяет любому приложению использовать уже реализованные возможности других приложений, к которым разрешен доступ?",
            R.drawable.android_question,
            "Application Framework", "Linux Kernel",
            "Applications", "Libraries & Android Runtime", 1
        )
        questionsList.add(que14)
        val que15 = Questions(
            15, "Инструмент разработки, позволяющий адаптировать код С/С++ для работы на Android, это -",
            R.drawable.android_question,
            "Google Android SDK (ADT Bundle)", "Marmalade SDK",
            "Intel* Software Manager", "Android NDK", 4
        )
        questionsList.add(que15)
        val que16 = Questions(
            16, "Чем являются Eclipse и IDEA?",
            R.drawable.android_question,
            "API (интерфейс прикладного программирования)", "IDE (интегрированная среда разработки)",
            "SDK (набор средств разработки)", "ADT (инструменты разработки под Android)", 2
        )
        questionsList.add(que16)
        val que17 = Questions(
            17, "К проблемам разработки под ОС Android можно отнести:",
            R.drawable.android_question,
            "отсутствие эффективных инструментов разработки", "ненадежную изоляцию ядра системы от выполняемых приложений",
            "все варианты ответа верны", "большое разнообразие устройств, невозможность проверки приложения на всех", 4
        )
        questionsList.add(que17)
        val que18 = Questions(
            18, "К преимуществам среды разработки Intel XDK можно отнести:",
            R.drawable.android_question,
            "легкость разработки кроссплатформенных приложений", "все варианты ответа верны",
            "наличие облачного хранилища для разработанных приложений", "наличие собственного эффективного эмулятора", 2
        )
        questionsList.add(que18)
        val que19 = Questions(
            19, "Не является средством разработки под Android:",
            R.drawable.android_question,
            "ProGuard", "Device Monitor",
            "AVD Manager", "SDK Manager", 1
        )
        questionsList.add(que19)
        val que20 = Questions(
            20, "С какой целью был создан Open Handset Alliance?",
            R.drawable.android_question,
            "писать историю развития ОС Android", "продавать смартфоны под управлением Android",
            "разрабатывать открытые стандарты для мобильных устройств", "рекламировать смартфоны под управлением Android", 3
        )
        questionsList.add(que20)
        val que21 = Questions(
            21, "Какое название получила версия Android 4.4?",
            R.drawable.android_question,
            "Krispy Kreme", "kream-karamel",
            "kitekat", "Kit Kat", 4
        )
        questionsList.add(que21)
        val que22 = Questions(
            22, "С какой целью инструмент Intel* Hardware Accelerated Execution Manager (Intel* HAXM) используется в среде разработки Intel* Beacon Mountain?",
            R.drawable.android_question,
            "для ускорения работы эмулятора в среде разработки", "для эффективного распараллеливания С++ мобильных приложений",
            "для оптимизированной обработки данных и изображений", "для оптимизации загрузки системы при использовании процедур OpenGL", 1
        )
        questionsList.add(que22)
        val que23 = Questions(
            23, "С какой целью инструмент Intel* Graphics Performance Analyzers (Intel* GPA) System Analyzer используется в среде разработки Intel* Beacon Mountain?",
            R.drawable.android_question,
            "позволить разработчикам эффективно распараллелить С++ мобильные приложения", "позволить разработчикам оптимизировать загруженность системы при использовании процедур OpenGL",
            "для ускорения работы эмулятора в среде разработки", "для оптимизированной обработки данных и изображений", 2
        )
        questionsList.add(que23)
        val que24 = Questions(
            24, "Intel XDK поддерживает разработку под:",
            R.drawable.android_question,
            "JavaFX Mobile", "Apple iOS, BlackBerry OS",
            "Android, Apple iOS, Microsoft Windows 8, Tizen", "MtkOS, Symbian OS, Microsoft Windows 8", 3
        )
        questionsList.add(que24)
        val que25 = Questions(
            25, "Какая графическая библиотека входит в набор библиотек ОС Android?",
            R.drawable.android_question,
            "OpenCV", "DirectX",
            "Open GL", "OpenCL", 3
        )
        questionsList.add(que25)
        val que26 = Questions(
            26, "Приложения, не имеющие GUI и выполняющиеся в фоновом режиме - это",
            R.drawable.android_question,
            "Intents", "Content Providers",
            "Activities", "Services", 4
        )
        questionsList.add(que26)
        val que27 = Questions(
            27, "Удобное средство обмена между двумя NFC-устройствами:",
            R.drawable.android_question,
            "Wi-Fi Direct", "Dalvik",
            "AndroidBeam", "Bluetooth", 3
        )
        questionsList.add(que27)
        val que28 = Questions(
            28, "Преимуществом эмуляторов является:",
            R.drawable.android_question,
            "невозможность полноценной отладки", "необходимость дополнительных системных ресурсов",
            "низкая стоимость", "медленный запуск", 3
        )
        questionsList.add(que28)
        val que29 = Questions(
            29, "Фоновые приложения ...",
            R.drawable.android_question,
            "после настройки не предполагают взаимодействия с пользователем, большую часть времени находятся и работают в скрытом состоянии", "небольшие приложения, отображаемые в виде графического объекта на рабочем столе",
            "выполняют свои функции и когда видимы на экране, и когда скрыты другими приложениями", "большую часть времени работают в фоновом режиме, однако допускают взаимодействие с пользователем и после настройки", 1
        )
        questionsList.add(que29)
        val que30 = Questions(
            30, "Какая папка в структуре Android-приложения содержит файлы с исходным кодом на языке Java?",
            R.drawable.android_question,
            "gen", "src",
            "bin", "res", 2
        )
        questionsList.add(que30)
        val que31 = Questions(
            31, "Приложение какого вида имеет смысл использовать для отображения динамической информации, такой как заряд батареи, прогноз погоды, дата и время?",
            R.drawable.android_question,
            "фоновое приложение", "приложение переднего плана",
            "виджет", "смешанное приложение", 3
        )
        questionsList.add(que31)
        val que32 = Questions(
            32, "Что находится в папке gen?",
            R.drawable.android_question,
            "ресурсы приложения", "аудио файлы",
            "изображения", "автоматически сгенерированные java-файлы", 4
        )
        questionsList.add(que32)
        val que33 = Questions(
            33, "Каждый приемник широковещательных сообщений является наследником класса ...",
            R.drawable.android_question,
            "ContentProvider", "BroadcastReceiver",
            "ViewReceiver", "IntentReceiver", 2
        )
        questionsList.add(que33)
        val que34 = Questions(
            34, "Выберите верную последовательность действий, необходимых для создания в приложении контент-провайдера.",
            R.drawable.android_question,
            "Проектирование способа хранения данных; Создание класса-наследника от класса ContentProvider; Определение строки авторизации провайдера, URI для его строк и имен столбцов", "Создание класса наследника от класса ContentProvider; Заполнение контент-провайдера данными; Определение способа работы с данными",
            "Проектирование способа хранения данных; Определение способа организации данных; Определение способа работы с данными", "Создание класса наследника от класса ContentProvider; Определение способа организации данных; Заполнение контент-провайдера данными", 1
        )
        questionsList.add(que34)
        val que35 = Questions(
            35, "Какой метод вызывается системой в случае, когда активность теряет фокус?",
            R.drawable.android_question,
            "onPause()", "onRestart()",
            "onDestroy()", "onStop()", 1
        )
        questionsList.add(que35)
        val que36 = Questions(
            36, "Какой вид компоновки определяет табличный способ расположения компонентов графического интерфейса пользователя в приложениях под Android?",
            R.drawable.android_question,
            "TableLayout", "RowLayout",
            "GridBagLayout", "GridLayout", 1
        )
        questionsList.add(que36)
        val que37 = Questions(
            37, "Дизайн или проектирование интерфейса для графических дизайнеров:",
            R.drawable.android_question,
            "передача информации о поведении посредством ожидаемого назначения", "прозрачность и понятность информации",
            "тон, стиль, композиция, которые являются атрибутами бренда", "все варианты ответа верны", 4
        )
        questionsList.add(que37)
        val que38 = Questions(
            38, "Следующие утверждения верны:",
            R.drawable.android_question,
            "текстура бесполезна для передачи различий или привлечения внимания", "люди легко воспринимают контрастность",
            "восприятие направления затруднено при больших размерах объектов", "все варианты ответа верны", 4
        )
        questionsList.add(que38)
        val que39 = Questions(
            39, "Элементы управления \"Радиокнопки\":",
            R.drawable.android_question,
            "должны иметь квадратную форму", "должны иметь круглую форму",
            "не должны иметь круглую форму", "могут иметь любую форму", 2
        )
        questionsList.add(que39)
        val que40 = Questions(
            40, "При создании справочной системы необходимо:",
            R.drawable.android_question,
            "использовать всплывающие подсказки", "создать руководство по \"быстрому старту\"",
            "все вышеперечисленное", "учитывать, что она не должна становиться костылем для продукта", 3
        )
        questionsList.add(que40)
        val que41 = Questions(
            41, "К элементам ввода относят:",
            R.drawable.android_question,
            "ограничивающие элементы ввода", "ползунки",
            "счетчики", "все вышеперечисленное", 4
        )
        questionsList.add(que41)
        val que42 = Questions(
            42, "Нижняя панель (Navigation Bar) предназначена",
            R.drawable.android_question,
            "для вывода времени", "для вывода уровня заряда батареи",
            "для вывода уровня сигнала сотовой сети", "для навигации на тех устройствах, которые не имеют аппаратных навигационных клавиш", 4
        )
        questionsList.add(que42)
        val que43 = Questions(
            43, "Один DP равен:",
            R.drawable.android_question,
            "одному пикселю на экране типа MDPI", "0,5 дюйма",
            "300 dpi", "0,3 мм", 1
        )
        questionsList.add(que43)
        val que44 = Questions(
            44, "Возможность прокрутки сеток стоит осуществлять",
            R.drawable.android_question,
            "только по горизонтали", "по горизонтали и по вертикали",
            "по горизонтали или по вертикали", "только по вертикали", 3
        )
        questionsList.add(que44)
        val que45 = Questions(
            45, "Текстовые гиперссылки при программировании для мобильных устройств:",
            R.drawable.android_question,
            "стоит использовать в исключительных случаях", "стоит использовать для перехода между окнами приложения",
            "все варианты ответа неверны", "стоит использовать повсеместно", 1
        )
        questionsList.add(que45)
        val que46 = Questions(
            46, "Какое визуальное свойство является самым главным в определении сущности объекта?",
            R.drawable.android_question,
            "размер", "яркость",
            "форма", "цвет", 3
        )
        questionsList.add(que46)
        val que47 = Questions(
            47, "При проектировании окон приложения необходимо:",
            R.drawable.android_question,
            "интегрировать в рабочее пространство инструменты, используемые наиболее часто", "для каждой функции делать отдельное диалоговое окно",
            "все вышеперечисленное", "позволять диалоговому окну оперировать только с одной функцией", 1
        )
        questionsList.add(que47)
        val que48 = Questions(
            48, "Примерами комбо-элементов не являются:",
            R.drawable.android_question,
            "комбо-список", "все вышеперечисленное",
            "комбо-поле", "комбо-кнопка", 3
        )
        questionsList.add(que48)
        val que49 = Questions(
            49, "К традиционным типографическим инструментам не относят",
            R.drawable.android_question,
            "цвет", "разреженность",
            "выравнивание по сетке", "масштаб", 1
        )
        questionsList.add(que49)
        val que50 = Questions(
            50, "Минимальный размер элемента управления",
            R.drawable.android_question,
            "64 dp", "48dp",
            "32px", "30pt", 2
        )
        questionsList.add(que50)
        val que51 = Questions(
            51, "Выделяют следующие категории элементов управления:",
            R.drawable.android_question,
            "системные элементы управления", "все варианты ответа верны",
            "элементы управления интерфейсами", "командные элементы управления", 4
        )
        questionsList.add(que51)
        val que52 = Questions(
            52, "В чем заключается суть структурных шаблонов проектирования?",
            R.drawable.android_question,
            "решают проблемы, относящиеся к взаимодействию с функциональными элементами", "решают проблемы, связанные с управлением отображением информации",
            "определяют тип продукта в отношении к пользователю", "все перечисленные", 2
        )
        questionsList.add(que52)
        val que53 = Questions(
            53, "Какие элементы управления применяются для действий по настройке?",
            R.drawable.android_question,
            "элементы ввода", "элементы отображения",
            "командные элементы управления", "элементы выбора", 4
        )
        questionsList.add(que53)
        val que54 = Questions(
            54, "Следующие утверждения не верны:",
            R.drawable.android_question,
            "на любом шаге должна быть возможность вернуться назад", "если объекты похожи, они должны выполнять сходные действия",
            "картинки работают быстрее, чем слова", "не используйте интерфейсные элементы", 4
        )
        questionsList.add(que54)
        val que55 = Questions(
            55, "Расстояние между элементами управления рекомендуется делать кратным:",
            R.drawable.android_question,
            "24dp", "8dp",
            "4dp", "16dp", 2
        )
        questionsList.add(que55)
        val que56 = Questions(
            56, "Основные вкладки (FixedTabs) удобны при отображении",
            R.drawable.android_question,
            "двух вкладок", "от четырех вкладок",
            "трех и менее вкладок", "трех и более вкладок", 3
        )
        questionsList.add(que56)
        val que57 = Questions(
            57, "Объектами информационного дизайна являются",
            R.drawable.android_question,
            "диаграммы", "все варианты ответа верны",
            "инфографика", "всевозможные графики", 2
        )
        questionsList.add(que57)
        val que58 = Questions(
            58, "Расположение элементов мобильного приложения:",
            R.drawable.android_question,
            "влияет на удобство использования", "полезно для передачи иерархии",
            "все варианты ответа верны", "полезно для создания пространственных отношений между объектами на экране и объектами реального мира", 3
        )
        questionsList.add(que58)
        val que59 = Questions(
            59, "Использование ярлычков для всех панелей сетки и полупрозрачных \"занавесок\" для неактивных панелей",
            R.drawable.android_question,
            "мешает пользователю понять, что скрывается под той или иной панелью", "скрывает от пользователя нужные панели",
            "нет правильного варианта ответа", "помогает пользователю быстрее понять, что скрывается под той или иной панелью", 4
        )
        questionsList.add(que59)
        val que60 = Questions(
            60, "Строительные блоки визуального дизайна интерфейсов:",
            R.drawable.android_question,
            "цвет", "все варианты ответа верны",
            "размер", "форма", 2
        )
        questionsList.add(que60)
        val que61 = Questions(
            61, "Более крупные элементы:",
            R.drawable.android_question,
            "привлекают больше внимания", "привлекают меньше внимания",
            "размер не влияет на уровень внимания", "все варианты ответа верны", 1
        )
        questionsList.add(que61)
        val que62 = Questions(
            62, "К элементам управления отображением не относятся:",
            R.drawable.android_question,
            "полосы прокрутки", "сетки и рамки",
            "разделители", "рукоятки", 4
        )
        questionsList.add(que62)
        val que63 = Questions(
            63, "Выделяют следующие категории плотности экрана для Android-устройств:",
            R.drawable.android_question,
            "правильный вариант ответа отсутствует", "HDPI, XHDPI, XXHDPI, и XXXHDPI",
            "LDPI, MDPI, HDPI", "LDPI, MDPI, HDPI, XHDPI, XXHDPI, и XXXHDPI", 4
        )
        questionsList.add(que63)
        val que64 = Questions(
            64, "Всплывающие подсказки стоит использовать, когда",
            R.drawable.android_question,
            "сообщение является важным и требует немедленного прочтения и ответа", "сообщение является важным, однако требует немедленного прочтения, но не ответа",
            "сообщение является важным, однако не требует немедленного прочтения и ответа", "сообщение не требует ответа пользователя, но важно для продолжения его работы", 4
        )
        questionsList.add(que64)
        val que65 = Questions(
            65, "ProgressDialog это:",
            R.drawable.android_question,
            "диалоговое окно, которое может содержать заголовок, до трех кнопок, список выбираемых значений или настраиваемое содержимое", "контейнер для создания собственных диалоговых окон",
            "диалоговое окно с предопределенным интерфейсом, позволяющее выбрать дату или время", "диалоговое окно, содержащее линейку процесса выполнения какого-то действия", 4
        )
        questionsList.add(que65)
        val que66 = Questions(
            66, "DialogFragment это:",
            R.drawable.android_question,
            "диалоговое окно, которое может содержать заголовок, до трех кнопок, список выбираемых значений или настраиваемое содержимое", "контейнер для создания собственных диалоговых окон",
            "диалоговое окно с предопределенным интерфейсом, позволяющее выбрать дату или время", "диалоговое окно, содержащее линейку процесса выполнения какого-то действия", 2
        )
        questionsList.add(que66)
        val que67 = Questions(
            67, "При загрузке приложения первой появляется активность,",
            R.drawable.android_question,
            "чье описание первым в лексикографическим порядке", "чье описание находится первым в манифесте",
            "чье описание находится последним в манифесте", "правильный вариант ответа отсутствует", 2
        )
        questionsList.add(que67)
        val que68 = Questions(
            68, "Для чего предназначен класс ListActivity?",
            R.drawable.android_question,
            "для создания нового листа", "для создания активности, основным элементом которой является список",
            "для создания обычной активности", "для создания активности, основным элементом которой является таблица", 2
        )
        questionsList.add(que68)
        val que69 = Questions(
            69, "Интерфейс Adapter позволяет:",
            R.drawable.android_question,
            "связывать список и названия его элементов", "оптимизировать процесс зарядки телефона",
            "обрабатывать нажатия", "адаптировать приложение к любой версии Android SDK", 1
        )
        questionsList.add(que69)
        val que70 = Questions(
            70, "Для создания собственных диалоговых окон используют контейнер:",
            R.drawable.android_question,
            "AlertDialog", "ProgressDialog",
            "DialogFragment", "DatePickerDialog", 3
        )
        questionsList.add(que70)
        val que71 = Questions(
            71, "Можно ли создать диалоговое окно без управляющих кнопок?",
            R.drawable.android_question,
            "нет, ни в коем случае", "да, если у него отсутствует содержательная часть",
            "нет, диалоговое окно должно содержать от одной до трех кнопок", "да, если элементы содержательной части являются кликабельными", 4
        )
        questionsList.add(que71)
        val que72 = Questions(
            72, "Заголовок диалогового окна:",
            R.drawable.android_question,
            "генерируется автоматически", "является обязательным элементом",
            "является необязательным элементом", "является необязательным элементом, если отсутствуют содержательная часть и управляющие кнопки", 3
        )
        questionsList.add(que72)
        val que73 = Questions(
            73, "Шаблон Fixed Tabs + Swipe позволяет переключаться между вкладками:",
            R.drawable.android_question,
            "только с помощью кнопок", "только с помощью перелистывания",
            "как с помощью кнопок, так и с помощью перелистывания", "не позволяет переключаться между вкладками", 3
        )
        questionsList.add(que73)
        val que74 = Questions(
            74, "Файлы ресурсов Layout должны размещаться в папке:",
            R.drawable.android_question,
            "/res/", "/res/anim",
            "/res/drawable", "/res/layout", 4
        )
        questionsList.add(que74)
        val que75 = Questions(
            75, "В каталоге assets данные размещаются в формате:",
            R.drawable.android_question,
            "ASCII", "DOS",
            "FAT", "raw file", 4
        )
        questionsList.add(que75)
        val que76 = Questions(
            76, "В каталоге assets данные размещаются в формате:",
            R.drawable.android_question,
            "ASCII", "DOS",
            "FAT", "raw file", 4
        )
        questionsList.add(que76)
        val que77 = Questions(
            77, "Пустой процесс не должен иметь:",
            R.drawable.android_question,
            "Активных компонентов приложения.", "Активных процессов.",
            "Активных сервисов.", "Занимать память.", 1
        )
        questionsList.add(que77)
        val que78 = Questions(
            78, "Инструмент bmgr используется для:",
            R.drawable.android_question,
            "Получения резервной копии приложения.", "Операции восстановления.",
            "Уничтожения архивных данных для конкретногоприложения.", "Все выше перечисленное.", 4
        )
        questionsList.add(que78)
        val que79 = Questions(
            79, "Какие утверждения верны относительно сервисов и потоков?",
            R.drawable.android_question,
            "Сервис запускается в отдельном потоке.", "Для потока можно создать несколько экземпляров, а для сервиса нет.",
            "Сервис не может использовать потоки для выполнения задач.", "Помидорка", 2
        )
        questionsList.add(que79)
        val que80 = Questions(
            80, "В чем разница между сервисом и асинхронной задачей?",
            R.drawable.android_question,
            "AsyncTask зависит от контекста Activity, из которой был запущен, а сервис нет.", "И AsyncTask и сервис выполняются в UI thread.",
            "И AsyncTask и сервис имеют доступ к UI thread.", "Тыковка", 1
        )
        questionsList.add(que80)
        val que81 = Questions(
            81, "В чем разница между потоком и асинхронной задачей?",
            R.drawable.android_question,
            "AsyncTask имеет доступ к UI потоку, а поток нет. Для доступа потока к UI потоку может использоватьсякласс Handler.", "AsyncTask представляет общий фреймворк потоков.",
            "И AsyncTask и потоки предназначены для выполнения длительных задач.", "Не знаю", 1
        )
        questionsList.add(que81)
        val que82 = Questions(
            82, "Максимальное количество адресов, возвращаемых методом getFromLocationName() может быть:",
            R.drawable.android_question,
            "2", "3",
            "4", "5", 4
        )
        questionsList.add(que82)
        val que83 = Questions(
            83, "Проверка наличия аудио эффектов осуществляется с помощью метода:",
            R.drawable.android_question,
            "isCheckable()", "isAvailable()",
            "isValuable()", "isCaview()", 2
        )
        questionsList.add(que83)
        val que84 = Questions(
            84, "Приложения, требующие фильтрации по размеру экрана, могут использовать атрибуты:",
            R.drawable.android_question,
            "<supportmultiple-screens>", "<supports-screens>",
            "<supportall-screens>", "<supportevery-screen>", 2
        )
        questionsList.add(que84)
        val que85 = Questions(
            85, "Какое утверждение ложно относительно метода onBind ():",
            R.drawable.android_question,
            "Вызывается, когда другой компонент хочет связываться со службой.", "Вызов метода startService () приводит к вызову метода onBind ().",
            "Если вы не хотите, чтобы связывание затем вернуло NULL.", "Если вы хотите, чтобы связывание затем вернуло объект Ibinder", 2
        )
        questionsList.add(que85)
        val que86 = Questions(
            86, "Какое утверждение ложно относительно метода onBind ():",
            R.drawable.android_question,
            "Вызывается, когда другой компонент хочет связываться со службой.", "Вызов метода startService () приводит к вызову метода onBind ().",
            "Если вы не хотите, чтобы связывание затем вернуло NULL.", "Если вы хотите, чтобы связывание затем вернуло объект Ibinder", 2
        )
        questionsList.add(que86)
        val que87 = Questions(
            87, "Какая операционная система используется как основа Android стека?",
            R.drawable.android_question,
            "Linux.", "Windows.",
            "Java.", "XML.", 1
        )
        questionsList.add(que87)
        val que88 = Questions(
            88, "Что не является одним из трех основных компонентов APK?",
            R.drawable.android_question,
            "Исполняемый код Dalvik.", "Ресурсы.",
            "Native Libraries", "Webkit", 4
        )
        questionsList.add(que88)
        val que89 = Questions(
            89, "Что содержит файл Layout xml?",
            R.drawable.android_question,
            "Ориентации и макеты, которые определяют то, отображает дисплей.", "Разрешения, необходимые приложению.",
            "Строки, используемые в приложении.", "Код, который компилируется для запуска приложения.", 1
        )
        questionsList.add(que89)
        val que90 = Questions(
            90, "R файл генерируется:",
            R.drawable.android_question,
            "Автоматически", "В ручном режиме",
            "Эмулируется", "Ничего из вышеперечисленного", 1
        )
        questionsList.add(que90)
        val que91 = Questions(
            91, "Какая команда не может быть выполнена функцией Android эмуляции скорости сети?",
            R.drawable.android_question,
            "network speed gsm", "network speed 14.4 80",
            "network speed 3g", "network speed edge", 3
        )
        questionsList.add(que91)
        val que92 = Questions(
            92, "Какое из следующих утверждений верно для Traceview?",
            R.drawable.android_question,
            "Отображает графический журнал выполнения задачи.", "Отображает графически занятие памяти и журнал релиза.",
            "Отображает графически стек вызовов.", "Показывает графически состояние UI иерархии.", 1
        )
        questionsList.add(que92)
        val que93 = Questions(
            93, "Где лучше всего разместить в приложении текстовый файл, используемый для чтения в качестве ресурса?",
            R.drawable.android_question,
            "res/anim", "res/files",
            "res/raw", "res/values", 4
        )
        questionsList.add(que93)
        val que94 = Questions(
            94, "Что выполняет следующий код? Intent intent = new Intent (FirstActivity. this, SecondActivity. class); startActivityForResult (intent);",
            R.drawable.android_question,
            "Посылает результаты другой активности", "Запускает активность браузера.",
            "Запускает суб-активность.", "Запускает сервис активности.", 3,
        )
        questionsList.add(que94)
        val que95 = Questions(
            95, "Что из следующего не является ContentProvider, поставляемым с платформой Android?",
            R.drawable.android_question,
            "Список контактов", "Журнал звонков",
            "Закладки", "Список приложений", 4
        )
        questionsList.add(que95)
        val que96 = Questions(
            96, "Какой метод нужно переопределить для использования системы меню Android?",
            R.drawable.android_question,
            "onCreateOptionsMenu ()", "onCreateMenu ()",
            "onMenuCreated ()", "onCreateContextMenu ().", 1
        )
        questionsList.add(que96)
        val que97 = Questions(
            97, "Что из следующего не является Android компонентом?",
            R.drawable.android_question,
            "Service", "Activity",
            "Layout", "Content Provider", 3
        )
        questionsList.add(que97)
        val que98 = Questions(
            98, "Что из следующего не верно для Intents?",
            R.drawable.android_question,
            "Активирует Activity.", "Активирует Service.",
            "Активирует Broadcast receiver.", "Активирует SQLite DB Connection.", 4
        )
        questionsList.add(que98)
        val que99 = Questions(
            99, "Что из следующего не может быть указано как состояние процесса?",
            R.drawable.android_question,
            "Non-visible", "Visible",
            "Foreground", "Background", 1
        )
        questionsList.add(que99)
        val que100 = Questions(
            100, "Как называется папка, содержащая файл R. java?",
            R.drawable.android_question,
            "src", "res",
            "bin", "gen", 4
        )
        questionsList.add(que100)


        return questionsList
    }

    fun getQuestionsPython(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1,
            "Какая из следующих функций преобразует одиночный символ в его целочисленный эквивалент в Python?",
            R.drawable.android_question,
            "hex(x)",
            "oct(x)",
            "unichr(x)",
            "ord(x)",
            4
        )
        questionsList.add(que1)
        val que2 = Questions(
            2,
            "Какая из следующих функций используется для проверки, все ли символы в строке находятся в нижнем регистре?",
            R.drawable.android_question,
            "islower()",
            "istitle()",
            "isnumeric()",
            "isspace()",
            1
        )
        questionsList.add(que2)
        val que3 = Questions(
            3,
            "Что будет напечатано? kvps = {\"user\",\"bill\", \"password\",\"hillary\"} print(kvps['password'])",
            R.drawable.android_question,
            "password",
            "Ничего",
            "TypeError",
            "hillary",
            3
        )
        questionsList.add(que3)
        val que4 = Questions(
            4, "Все ключевые слова в Python пишутся ...",
            R.drawable.android_question,
            "Ничего из перечисленного", "С заглавной буквы",
            "в нижнем регистре", "В ВЕРХНЕМ РЕГИСТРЕ", 1
        )
        questionsList.add(que4)
        val que5 = Questions(
            5,
            "Почему не рекомендуется использовать имена локальных переменных, начинающиеся с подчеркивания?",
            R.drawable.android_question,
            "Все перечисленное",
            "Они замедляют исполнение",
            "Они используются для обозначения глобальных переменных",
            "Они используются для обозначения частных переменных класса",
            4
        )
        questionsList.add(que5)
        val que6 = Questions(
            6, "Какова максимально возможная длина идентификатора?",
            R.drawable.android_question,
            "43 символа", "67 символов",
            "79 символов", "35 символов", 3
        )
        questionsList.add(que6)
        val que7 = Questions(
            7, "Чувствителен ли Python к регистру при работе с идентификаторами?",
            R.drawable.android_question,
            "Ни один из перечисленных", "Да",
            "Иногда", "Нет", 2
        )
        questionsList.add(que7)
        val que8 = Questions(
            8,
            "Какая из следующих переменных среды для Python является альтернативным путем поиска модуля?",
            R.drawable.android_question,
            "PYTHONPATH",
            "PYTHONHOME",
            "PYTHONSTARTUP",
            "PYTHONCASEOK",
            2
        )
        questionsList.add(que8)
        val que9 = Questions(
            9,
            "Что будет напечатано при исполнении следующего кода? Используется Python 2.x .print(type(1 / 2))",
            R.drawable.android_question,
            "type 'double'",
            "type 'tuple'",
            "type 'int'",
            "type 'number'",
            3
        )
        questionsList.add(que9)
        val que10 = Questions(
            10, "Ввод целого числа с клавиатуры записывается как:",
            R.drawable.android_question,
            "input(int())", "int(input())",
            "int()", "input()", 2
        )
        questionsList.add(que10)
        val que11 = Questions(
            11, "Что из следующего эквивалентно random.randint(3, 6)?",
            R.drawable.android_question,
            "random.choice([3, 6])", "3 + random.randrange(4)",
            "3 + random.randrange(3)", "random.randrange(3, 6)", 2
        )
        questionsList.add(que11)
        val que12 = Questions(
            12,
            "Какой из следующих операторов в Python оценивается как истина, если он не находит переменную в указанной последовательности, и ложь в противном случае?",
            R.drawable.android_question,
            "**",
            "//",
            "not in",
            "is",
            3
        )
        questionsList.add(que12)
        val que13 = Questions(
            13, "Какой оператор верный для power(x^y) ?",
            R.drawable.android_question,
            "Ни один из перечисленных", "X**y",
            "X^^y", "Х^у", 2
        )
        questionsList.add(que13)
        val que14 = Questions(
            14,
            "Какая из следующих функций используется для проверки, все ли символы в строке являются десятичными?",
            R.drawable.android_question,
            "upper()",
            "swapcase()",
            "isdecimal()",
            "title()",
            3
        )
        questionsList.add(que14)
        val que15 = Questions(
            15,
            "Что делает random.shuffle (x), когда x = [1, 2, 3]?",
            R.drawable.android_question,
            "Перемешает элементы списка на месте",
            "Ни один из перечисленных",
            "Ничего не делает, это заполнитель для функции, которая еще не реализована",
            "Вернет список, в котором элементы 1, 2 и 3 находятся в случайных положениях",
            1
        )
        questionsList.add(que15)
        val que16 = Questions(
            16, "Какой диапазон значений может возвращать random.random()?",
            R.drawable.android_question,
            "(0.0, 1.0)", "[0.0, 1.0]",
            "(0.0, 1.0]", "[0.0, 1.0)", 4
        )
        questionsList.add(que16)
        val que17 = Questions(
            17, "Что из следующего в Python является недопустимым?",
            R.drawable.android_question,
            "a,b,c = 1000, 2000, 3000", "a b c = 1000 2000 3000",
            "abc = 1,000,000", "a_b_c = 1,000,000", 2
        )
        questionsList.add(que17)
        val que18 = Questions(
            18,
            "Предположим, d = {\"john\": 40, \"peter\": 45}, чтобы удалить запись для \"john\". Какую команду мы используем?",
            R.drawable.android_question,
            "d.delete(\"john\":40)",
            "del d[\"john\"]",
            "del d(\"john\":40)",
            "d.delete(\"john\")",
            2
        )
        questionsList.add(que18)
        val que19 = Questions(
            19,
            "Имеется кортеж вида T = (4, 2, 3). Какая из операций приведёт к тому, что имя T будет ссылаться на кортеж (1, 2, 3)?",
            R.drawable.android_question,
            "T[0] = 1",
            "T = (1) + T[1:]",
            "T = (1,) + T[1:]",
            "T.startswith(1)",
            3
        )
        questionsList.add(que19)
        val que20 = Questions(
            20,
            "Для чего в Python используется встроенная функция enumerate()?",
            R.drawable.android_question,
            "Для определения количества элементов последовательности.",
            "Для одновременного итерирования по самим элементам и их индексам.",
            "Для сортировки элементов по значениям id.",
            "Для ввода данных",
            2
        )
        questionsList.add(que20)
        val que21 = Questions(
            21,
            "Необходимо собрать и вывести все уникальные слова из строки рекламного текста. Какой из перечисленных типов данных Python подходит лучше всего?",
            R.drawable.android_question,
            "кортеж (tuple)",
            "список (list)",
            "множество (set)",
            "словарь (dict)",
            3
        )
        questionsList.add(que21)
        val que22 = Questions(
            22, "Как вывести список методов и атрибутов объекта x?",
            R.drawable.android_question,
            "help(x)", "info(x)",
            "?x", "dir(x)", 4
        )
        questionsList.add(que22)
        val que23 = Questions(
            23, "Какая из перечисленных инструкций выполнится быстрее всего, если n = 10**6?",
            R.drawable.android_question,
            "a = list(i for i in range(n))", "a = [i for i in range(n)]",
            "a = (i for i in range(n))", "a = {i for i in range(n)}", 3
        )
        questionsList.add(que23)
        val que24 = Questions(
            24,
            "С помощью Python нужно записать данные в файл, но только в том случае, если файла ещё нет. Какой режим указать в инструкции open()?",
            R.drawable.android_question,
            "'x'",
            "'w'",
            "'r'",
            "'l'",
            1
        )
        questionsList.add(que24)
        val que25 = Questions(
            25,
            "Для чего в пакетах модулей python в файле __init__.py служит список __all__?",
            R.drawable.android_question,
            "Для конструкторов классов, как и всё, что связано с __init__",
            "Список определяет, что экспортировать, когда происходит импорт с помощью from *",
            "Для перечисления переменных, которые будут скрыты для импортирования.",
            "Все из вышеперечисленного",
            2
        )
        questionsList.add(que25)
        val que26 = Questions(
            26,
            "При объявлении класса с помощью оператора class что пишется в круглых скобках после имени класса?",
            R.drawable.android_question,
            "Имена аргументов, принимаемых методом __init__.",
            "Имена принимаемых классом аргументов.",
            "Имена суперклассов, если класс наследуется от одного или нескольких классов.",
            "Имена классов, порождаемых данным классом.",
            3
        )
        questionsList.add(que26)
        val que27 = Questions(
            27,
            "Какую роль в описании метода класса выполняет декоратор @property?",
            R.drawable.android_question,
            "Декорированный метод становится статическим, экземпляр не передаётся.",
            "Декорированный метод становится методом класса: метод получает класс, а не экземпляр.",
            "Значение, возвращаемое декорированным методом, вычисляется при извлечении. Можно обратиться к методу экземпляра, как к атрибуту.",
            "Защищенный метод",
            3
        )
        questionsList.add(que27)
        val que28 = Questions(
            28, "Какая функция отвечает за вывод длины списка?",
            R.drawable.android_question,
            "length()", "size()",
            "getLen()", "len()", 4
        )
        questionsList.add(que28)
        val que29 = Questions(
            29, "Какая конструкция служит для создания анонимной функции?",
            R.drawable.android_question,
            "lambda func", "omega",
            "anonymous", "lambda", 4
        )
        questionsList.add(que29)
        val que30 = Questions(
            30, "Что такое рекурсия?",
            R.drawable.android_question,
            "вызов функции в обратном порядке ее алгоритма", "возвращение результатов функции",
            "описание какого-либо объекта внутри этого самого объекта", "подбор параметров функции", 3
        )
        questionsList.add(que30)
        val que31 = Questions(
            31, "За создание какой функции отвечает конструкция def?",
            R.drawable.android_question,
            "анонимной функции", "рекурсивной функции",
            "именной функции", "функции-итератора", 3
        )
        questionsList.add(que31)
        val que32 = Questions(
            32, "Какой метод отвечает за добавление элемента в конец списка?",
            R.drawable.android_question,
            "add()", "include()",
            "input()", "append()", 4
        )
        questionsList.add(que32)
        val que33 = Questions(
            33, "Выберите верное утверждение про списки",
            R.drawable.android_question,
            "списки имеют фиксированный размер", "списки невозможно сортировать",
            "списки представляют собой массивы", "списки в Python являются изменяемыми", 4
        )
        questionsList.add(que33)
        val que34 = Questions(
            34, "Для каких типов элементов списка метод sort() работает без ошибок?",
            R.drawable.android_question,
            "только для строковых", "только для целочисленных",
            "для любых типов элементов", "для однотипных элементов одного списка", 4
        )
        questionsList.add(que34)
        val que35 = Questions(
            35, "Какие из функций являются уникальными?",
            R.drawable.android_question,
            "анонимные", "генераторы",
            "именные", "итераторы", 3
        )
        questionsList.add(que35)
        val que36 = Questions(
            36, "Какой метод отвечает за удаление элемента с указанной позицией?",
            R.drawable.android_question,
            "clear()", "pop()",
            "delete()", "remove()", 2
        )
        questionsList.add(que36)
        val que37 = Questions(
            37, "Каково основное назначение рекурсии в функциях?",
            R.drawable.android_question,
            "итерационный перебор через циклы", "работа со списками",
            "возвращение необходимого результата", "замена цикла", 4
        )
        questionsList.add(que37)
        val que38 = Questions(
            38, "Язык программирования Python подходит для разработки:",
            R.drawable.android_question,
            "Аналитика и машинное обучение", "Игр",
            "Компьютерных и мобильных приложений", "Все вышеперечисленное", 4
        )
        questionsList.add(que38)
        val que39 = Questions(
            39, "Что хранит в себе переменная?",
            R.drawable.android_question,
            "Тип", "Значение",
            "Имя", "Длину своего значения", 2
        )
        questionsList.add(que39)
        val que40 = Questions(
            40, "Что обозначает тип данных int?",
            R.drawable.android_question,
            "Вещественное", "Логическое",
            "Целочисленное", "Строковое", 3
        )
        questionsList.add(que40)
        val que41 = Questions(
            41, "Выберите правильную запись оператора присваивания",
            R.drawable.android_question,
            "10 = х", "у = 7,8",
            "x = 5", "а == b + x", 3
        )
        questionsList.add(que41)
        val que42 = Questions(
            42, "Укажите оператор ввода:",
            R.drawable.android_question,
            "random()", "print()",
            "int()", "input()", 4
        )
        questionsList.add(que42)
        val que43 = Questions(
            43, "Сколько возможных значений у переменной типа bool?",
            R.drawable.android_question,
            "Бесконечность не предел", "2",
            "10", "4", 2
        )
        questionsList.add(que43)
        val que44 = Questions(
            44, "Что лучше использовать для множественного ветвления?",
            R.drawable.android_question,
            "if – else – elif", "Много if",
            "if – elif –else", "while", 3
        )
        questionsList.add(que44)
        val que45 = Questions(
            45, "Операторы цикла в языке Python",
            R.drawable.android_question,
            "while, for", "print",
            "def", "if", 1
        )
        questionsList.add(que45)
        val que46 = Questions(
            46, "Для чего нужен оператор break?",
            R.drawable.android_question,
            "Для поломки компьютера", "Для завершения программы",
            "Для удаления программы", "Для выхода из цикла", 4
        )
        questionsList.add(que46)
        val que47 = Questions(
            47,
            "Где находятся параметры, а где аргументы функции?",
            R.drawable.android_question,
            "У функции есть только параметры",
            "Аргументы пишутся при объявлении функции, параметры при вызове",
            "Параметры пишутся при объявлении функции, аргументы при вызове",
            "Это одно и то же!",
            3
        )
        questionsList.add(que47)
        val que48 = Questions(
            48, "Что делает функция len()?",
            R.drawable.android_question,
            "Возвращает случайное число", "Возвращает длину строки",
            "Возвращает номер элемента", "Возвращает модуль числа", 2
        )
        questionsList.add(que48)
        val que49 = Questions(
            49, "Как добавить модуль в программу?",
            R.drawable.android_question,
            "import (math)", "import.math",
            "import math", "import math()", 3
        )
        questionsList.add(que49)
        val que50 = Questions(
            50, "На каких операционных системах может работать Python?",
            R.drawable.android_question,
            "Windows", "Linux",
            "macOS", "Все вышеперечисленное", 4
        )
        questionsList.add(que50)
        val que51 = Questions(
            51, "От чего язык программирования называется «Питон»?",
            R.drawable.android_question,
            "В честь блюда", "В честь игры",
            "В честь змеи", "В честь ТВ-шоу", 4
        )
        questionsList.add(que51)
        val que52 = Questions(
            52, "Сколько уже лет языку программирования Python?",
            R.drawable.android_question,
            "30", "7",
            "19", "15", 1
        )
        questionsList.add(que52)
        val que53 = Questions(
            53, "а = 345. Что выведет команда print(//100)",
            R.drawable.android_question,
            "3.45", "5",
            "3", "4", 3
        )
        questionsList.add(que53)
        val que54 = Questions(
            54, "В какой строке правильно записан ввод числа с клавиатуры?",
            R.drawable.android_question,
            "a = int(input())", "d = str(input())",
            "b = input(int())", "c = int(input)f = print()", 1
        )
        questionsList.add(que54)
        val que55 = Questions(
            55, "Что такое «else»?",
            R.drawable.android_question,
            "Если", "Иначе",
            "Пока", "Так как", 2
        )
        questionsList.add(que55)
        val que56 = Questions(
            56, "Дан массив >>> c = array([[1,2], [2,3], [4,5]]) Чему равен срез c[:,1]: ",
            R.drawable.android_question,
            "array([1, 2, 4])", "array([2, 3])",
            "array([2, 3, 5])", "array([[1,2], [2,3], [4,5]])", 3
        )
        questionsList.add(que56)
        val que57 = Questions(
            57,
            "Для чего применяется метод nextset() объекта-курсора:",
            R.drawable.android_question,
            "для перехода к следующему набору записей результата запроса ",
            "для перехода к следующей записи результата запроса",
            "для получения следующего набора записей результата запроса",
            "для ввода данных",
            1
        )
        questionsList.add(que57)
        val que58 = Questions(
            58, "В каком модуле нужно искать функции, помогающие тестировать программу:",
            R.drawable.android_question,
            "dictutils", "profile",
            "unittest", "math", 3
        )
        questionsList.add(que58)
        val que59 = Questions(
            59, "Какой метод позволяет узнать, имеет ли данное сообщение несколько частей:",
            R.drawable.android_question,
            "items()", "get_payload()",
            "is_multipart()", "find()", 3
        )
        questionsList.add(que59)
        val que60 = Questions(
            60, "К какому уровню модели взаимодействия открытых систем относится протокол FTP:",
            R.drawable.android_question,
            "приложений", "представления",
            "сетевому", "не знаю", 1
        )
        questionsList.add(que60)
        val que61 = Questions(
            61,
            "Какой модуль стандартной библиотеки Python позволяет работать с WWW на более низком уровне:",
            R.drawable.android_question,
            "httplib",
            "urlparse",
            "urllib2",
            "os",
            1
        )
        questionsList.add(que61)
        val que62 = Questions(
            62,
            "Сокрытие информации о внутреннем устройстве объекта, при котором вся работа с объектом ведется только через общедоступный интерфейс называется:",
            R.drawable.android_question,
            "абстракцией",
            "инкапсуляцией",
            "агрегацией",
            "наследование",
            2
        )
        questionsList.add(que62)
        val que63 = Questions(
            63,
            "Как следует воспринимать класс в ООП?",
            R.drawable.android_question,
            "как фрагмент программы, которая выполняется при вызове этого класса",
            "как шаблон, по которому конструируются объекты этого класса",
            "понятие КЛАСС в ООП не существует",
            "как локальное хранилище разнородных данных, подобно базе данных",
            2
        )
        questionsList.add(que63)
        val que64 = Questions(
            64,
            "Можно ли создавать программы без использования ООП?",
            R.drawable.android_question,
            "да, например, используя парадигму структурного программирования (не включая ООП)",
            "можно, но тогда придется отказаться от функционального подхода к программированию",
            "нет, ООП - неотъемлемая часть больших приложений",
            "да, но только относительно простые",
            1
        )
        questionsList.add(que64)
        val que65 = Questions(
            65,
            "Верно ли, что функции не содержащие явной инструкции return, на самом деле возвращают значение None?",
            R.drawable.android_question,
            "нет",
            "да",
            "не всегда",
            "никто не знает",
            2
        )
        questionsList.add(que65)
        val que66 = Questions(
            66, "Что возвратит метод String.find, если указанный фрагмент не будет найден в строке?",
            R.drawable.android_question,
            "значение -1", "значение 0",
            "значение None", "ничего, возникнет ошибка ValueError", 1
        )
        questionsList.add(que66)
        val que67 = Questions(
            67, "Какие типы данных могут быть значениями у словаря",
            R.drawable.android_question,
            "Любые", "Изменяемые",
            "Неизменяемые", "Числовые", 1
        )
        questionsList.add(que67)
        val que68 = Questions(
            68, "Когда вызывается метод __init__?",
            R.drawable.android_question,
            "При обращении к методу экземпляра", "При создании экземпляра",
            "При объявлении класса", "При обращении к функции", 2
        )
        questionsList.add(que68)
        val que69 = Questions(
            69, "Выберите изменяемый тип данных",
            R.drawable.android_question,
            "tuple", "set",
            "float", "Все неизменяемые", 2
        )
        questionsList.add(que69)
        val que70 = Questions(
            70, "Оператор множественного выбора в Python это?",
            R.drawable.android_question,
            "select ... case", "case ... of",
            "отсутствует", "when ... then", 3
        )
        questionsList.add(que70)
        val que71 = Questions(
            71, "Что получится в результате выполнения \"a\"*3 ?",
            R.drawable.android_question,
            "Исключение", "Строка \"aaa\"",
            "Строка \"a3\"", "Строка \"333\"", 2
        )
        questionsList.add(que71)
        val que72 = Questions(
            72,
            "Python вопрос:  Что получится в результате выполнения среза [::-1] для строки “привет”?",
            R.drawable.android_question,
            "\"т\"",
            "\"тевирп\"",
            "не знаю",
            "\"привет-1\"",
            2
        )
        questionsList.add(que72)
        val que73 = Questions(
            73, "Для чего из перечисленного не существует специального метода?",
            R.drawable.android_question,
            "Для знака ==", "Для оператора is",
            "Для знака >=", "Для функции next", 2
        )
        questionsList.add(que73)
        val que74 = Questions(
            74, "У чего из перечисленного нет блока else",
            R.drawable.android_question,
            "try", "while",
            "for", "У всего этого есть", 4
        )
        questionsList.add(que74)
        val que75 = Questions(
            75, "Какой метод отвечает за отображении объекта при вызове функции print?",
            R.drawable.android_question,
            "_str_", "_unicode_",
            "_read_", "_print_", 1
        )
        questionsList.add(que75)
        val que76 = Questions(
            76, "При помощи чего можно создать утверждение в python?",
            R.drawable.android_question,
            "raise", "assert",
            "async", "в python нельзя создавать утверждения", 2
        )
        questionsList.add(que76)
        val que77 = Questions(
            77, "Выбери что из этого не является методом списков",
            R.drawable.android_question,
            "extend", "insert",
            "sorted", "reverse", 3
        )
        questionsList.add(que77)
        val que78 = Questions(
            78, "Какой метод превратит строку в байтовую строку?",
            R.drawable.android_question,
            "encode()", "decode()",
            "bin()", "dec()", 1
        )
        questionsList.add(que78)
        val que79 = Questions(
            79, "Какие существуют способы форматирования строк?",
            R.drawable.android_question,
            "f-строки", ".format()",
            "%", "Все из вышеперечисленного", 4
        )
        questionsList.add(que79)
        val que80 = Questions(
            80, "Выберите знак, который соответствует симметрической разности множеств",
            R.drawable.android_question,
            "&", "|",
            "^", "-", 3
        )
        questionsList.add(que80)
        val que81 = Questions(
            81, "Какая библиотека предназначена для работы с потоками?",
            R.drawable.android_question,
            "thread", "threads",
            "threading", "multiprocessing", 3
        )
        questionsList.add(que81)
        val que82 = Questions(
            82, "Можно ли складывать кортежи?",
            R.drawable.android_question,
            "Да", "Нет",
            "Только числовые", "Только строковые", 1
        )
        questionsList.add(que82)
        val que83 = Questions(
            83,
            "Что такое контекстный менеджер в Python и зачем он нужен?",
            R.drawable.android_question,
            "Специальный метод ＿context＿ хранит текущие переменные блока исполнения программы",
            "Специальный класс, в котором объявлены методы ＿enter＿ и ＿exit＿",
            "Способ управлять областью видимости переменных",
            "Дает возможность выполнять определённый код до входа в блок with и после выхода из него",
            2
        )
        questionsList.add(que83)
        val que84 = Questions(
            84,
            "Можно ли в классе сослаться на родительский класс?",
            R.drawable.android_question,
            "Синтаксис языка не позволяет этого сделать напрямую. Можно создать экземпляр класса и передать его в переменной.",
            "Можно воспользоваться методом ＿class＿().",
            "Следует обратиться к методу super().",
            "Следует обратиться к методу ＿main＿().",
            3
        )
        questionsList.add(que84)
        val que85 = Questions(
            85,
            "Как в шаблонах Django получить текущие разрешения, предоставленные пользователю?",
            R.drawable.android_question,
            "По умолчанию такой возможности не предоставляется, нужно реализовывать самостоятельно, прокидывая переменную в шаблон",
            "Нужно использовать {perms}}",
            "Нужно использовать {{ permissions }}",
            "Разрешения доступны и через {{ perms }} и через {{ permissions }}",
            2
        )
        questionsList.add(que85)
        val que86 = Questions(
            86, "Какой open source формат используется в docker compose файлах?",
            R.drawable.android_question,
            "json", "yaml",
            "xml", "markdown", 1
        )
        questionsList.add(que86)
        val que87 = Questions(
            87, "Привести переменную x к типу числа с плавающей точкой можно следующим способом:",
            R.drawable.android_question,
            "x.double() ", "x.__double__() ",
            "double(x) ", "никаким из вышеперечисленных", 4
        )
        questionsList.add(que87)
        val que88 = Questions(
            88,
            "Из приведенных ниже высказываний укажите истинное:",
            R.drawable.android_question,
            "перед использованием переменной она должна быть определена с указанием типа и инициализирована каким-либо значением ",
            "перед использованием переменной она должна быть определена с указанием типа ",
            "перед использованием переменной она должна быть инициализирована каким-либо значением ",
            "переменные не обязаны быть инициализированы каким-либо значением перед использованием, а тип переменной определяется в зависимости от контекста ",
            3
        )
        questionsList.add(que88)
        val que89 = Questions(
            89, "В языке Python циклом с предусловием является:",
            R.drawable.android_question,
            "do-while", "iterate ",
            "while ", "for ", 3
        )
        questionsList.add(que89)
        val que90 = Questions(
            90,
            "Инструкция for в языке Python:",
            R.drawable.android_question,
            "всегда перебирает элементы арифметической прогрессии, причем шаг и условия выхода фиксированные ",
            "предоставляет полный выбор перебираемой последовательности, итератора и условий выхода пользователю ",
            "перебирает любую последовательность в порядке, заданным пользователем ",
            "перебирает любую последовательность в порядке следования элементов ",
            4
        )
        questionsList.add(que90)
        val que91 = Questions(
            91, "Оператор continue используется:",
            R.drawable.android_question,
            "в качестве пустого оператора ", "для перехода к следующей итерации цикла ",
            "для выхода из цикла ", "для выхода из блока if", 2
        )
        questionsList.add(que91)
        val que92 = Questions(
            92,
            "Оператор pass используется:",
            R.drawable.android_question,
            "в качестве пустого оператора ",
            "для перехода к следующей итерации цикла ",
            "для выхода из цикла ",
            "для возврата из функции и продолжения программы с точки ее вызова ",
            1
        )
        questionsList.add(que92)
        val que93 = Questions(
            93, "Что в python не является объектом?",
            R.drawable.android_question,
            "Строки", "Числа",
            "Функции", "Все является объектом", 4
        )
        questionsList.add(que93)
        val que94 = Questions(
            94,
            "Как называется автоматический процесс, во время которого удаляются ненужные объекты для освобождения памяти?",
            R.drawable.android_question,
            "Удаление мусора",
            "Очистка памяти",
            "Сборка мусора",
            "Не знаю",
            3
        )
        questionsList.add(que94)
        val que95 = Questions(
            95, "Какой метод строк проверяет, что в строке все символы - цифры?",
            R.drawable.android_question,
            "isalpha", "isalnum",
            "isdigit", "isint", 3
        )
        questionsList.add(que95)
        val que96 = Questions(
            96, "Что не является методом множества?",
            R.drawable.android_question,
            "add", "union",
            "intersection", "Все является", 4
        )
        questionsList.add(que96)
        val que97 = Questions(
            97, "Какой тип данных нехэшируемый?",
            R.drawable.android_question,
            "float", "set",
            "frozenset", "str", 2
        )
        questionsList.add(que97)
        val que98 = Questions(
            98, "Без чего невозможно создать исключение?",
            R.drawable.android_question,
            "try", "except",
            "else", "finally", 1
        )
        questionsList.add(que98)
        val que99 = Questions(
            99, "Что из этоого не является объектом класса int?",
            R.drawable.android_question,
            "5", "int('5')",
            "True", "Все является", 4
        )
        questionsList.add(que99)
        val que100 = Questions(
            100, "Сколько максимум именованных аргументов может принимать функция print?",
            R.drawable.android_question,
            "0", "1",
            "4", "Неограниченное количество", 3
        )
        questionsList.add(que100)

        return questionsList
    }

    fun getQuestionsLinux(): ArrayList<Questions>{
        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1, "Ядро операционной системы:",
            R.drawable.android_question,
            "программы, входящие в дистрибутив операционной системы", "резидентная часть операционной системы",
            "основная программа, принимающая и обрабатывающая команды пользователя", "графическая оболочка, позволяющая выполнить операции с файлами и каталогами", 2
        )
        questionsList.add(que1)
        val que2 = Questions(
            2, "Привилегированный режим работы программы:",
            R.drawable.android_question,
            "режим монопольного владения процессором на время работы программы", "режим, при котором программа в любой момент может монопольно завладеть процессором",
            "режим неограниченного доступа ко всем ресурсам компьютера", "режим, при котором программа имеет привилегии перед другими программами в условиях многозадачности", 1
        )
        questionsList.add(que2)
        val que3 = Questions(
            3, "К основным функциям операционных систем относятся:",
            R.drawable.android_question,
            "управление включением/выключением компьютера, управление памятью, управление файлами и каталогами, управление пользователями", "управление памятью, выполнение команд пользователя, управление файлами и каталогами",
            "управление процессами, управление памятью, управление периферийными устройствами", "управление устройствами, управление данными, управление памятью, управление процессами", 4
        )
        questionsList.add(que3)
        val que4 = Questions(
            4, "Ресурс процесса:",
            R.drawable.android_question,
            "оперативная память и свободное место на диске", "файл, из которого или в который происходит ввод-вывод",
            "любой аппаратный или программный объект, который может понадобиться для работы процесса и доступ к которому может при этом вызвать конкуренцию процессов", "любой аппаратный или программный объект, который может понадобиться для работы процесса и работа с которым не вызывает конфликта с другими процессами", 3
        )
        questionsList.add(que4)
        val que5 = Questions(
            5, "Дать определение невытесняющей многозадачности:",
            R.drawable.android_question,
            "режим многозадачности, при котором переключение процессов возможно в любой момент времени", "режим многозадачности, при котором переключение процессов возможно через определенные кванты времени",
            "режим многозадачности, при котором переключение процессов выполняется поочередно в порядке их приоритетов", "режим, при котором переключение процессов возможно только, когда работающий процесс вызовет системную функцию", 4
        )
        questionsList.add(que5)
        val que6 = Questions(
            6, "Дать определение вытесняющей многозадачности:",
            R.drawable.android_question,
            "режим многозадачности, при котором переключение процессов возможно в любой момент времени", "режим, при котором переключение процессов возможно только, когда работающий процесс вызовет системную функцию",
            "режим многозадачности, при котором каждый новый процесс монопольно занимает процессорное время, а состояние остальных процессов записывается в файл подкачки", "режим многозадачности, при котором переключение процессов происходит через определенные кванты времени соответственно приоритетам", 4
        )
        questionsList.add(que6)
        val que7 = Questions(
            7, "Дистрибутив операционной системы включает:",
            R.drawable.android_question,
            "операционную систему, программу ее установки и настройки, сопровождение и регулярное обновление", "только операционную систему и программу ее установки",
            "операционную систему, программу ее установки и наиболее популярные прикладные программы", "операционную систему, программу ее установки и наиболее популярные системные утилиты от сторонних разработчиков", 1
        )
        questionsList.add(que7)
        val que8 = Questions(
            8, "ОС распространяется по лицензии:",
            R.drawable.android_question,
            "GNU", "Линуса Торвальдса",
            "фирмы Microsoft", "компании GNU", 1
        )
        questionsList.add(que8)
        val que9 = Questions(
            9, "При установке ОС Linux рекомендуется выбрать файловую систему:",
            R.drawable.android_question,
            "FAT16 либо FAT32", "NTFS",
            "journalized ext3 FS", "любую из перечисленных.", 3
        )
        questionsList.add(que9)
        val que10 = Questions(
            10, "Жесткая ссылка на файл в ОС Linux:",
            R.drawable.android_question,
            "является дополнительным ярлыком для файла", "представляет собой другое имя файла",
            "это указатель на начало файла", "структура, содержащая сведения о расположении и размере файла", 2
        )
        questionsList.add(que10)
        val que11 = Questions(
            11, "Список пользователей системы хранится в файле",
            R.drawable.android_question,
            "/etc/users", "/etc/passwd",
            "/root/passwd", "/system/passwd", 2
        )
        questionsList.add(que11)
        val que12 = Questions(
            12, "Конвейером называют:",
            R.drawable.android_question,
            "параллельное выполнение нескольких команд, причем переключение между ними производится в строгой очередности", "параллельное выполнение нескольких команд, при этом вывод одной команды перенаправляется на стандартный ввод следующей",
            "последовательное выполнение нескольких команд, причем каждая следующая команда начинает выполняться после завершения предыдущей", "последовательное выполнение нескольких команд", 2
        )
        questionsList.add(que12)
        val que13 = Questions(
            13, "Пакет с программным обеспечением в Linux содержит:",
            R.drawable.android_question,
            "собранную программу, сценарии действий до установки и после нее, информацию о зависимостях от других пакетов", "собранную программу, сценарии действий до установки и после нее",
            "собранную программу, информацию о зависимостях от других пакетов, программу-установщик setup либо install", "собранную программу и программу-установщик setup либо install", 1
        )
        questionsList.add(que13)
        val que14 = Questions(
            14, "Командная оболочка операционной системы :",
            R.drawable.android_question,
            "программа, которая преобразует команды пользователя в действия операционной системы", "программа, которая выполняет команды пользователя",
            "часть операционной системы, котороая выполняет команды пользователя", "главный процесс", 1
        )
        questionsList.add(que14)
        val que15 = Questions(
            15, "Команда ls :",
            R.drawable.android_question,
            "выводит на экран список файлов текущего каталога", "делает заданный каталог текущим и выводит список файлов",
            "выполняет переход в заданный каталог", "выводит на экран список файлов каталога, заданного в командной строке либо текущего", 4
        )
        questionsList.add(que15)
        val que16 = Questions(
            16, "Для копирования файлов в ОС Linux используется команда:",
            R.drawable.android_question,
            "mkfile", "copy",
            "cp", "grep", 3
        )
        questionsList.add(que16)
        val que17 = Questions(
            17, "Файловый менеджер:",
            R.drawable.android_question,
            "программа для создания, удаления, копирования файлов", "программа для перемещения по каталогам",
            "программа управления атрибутами и редактирования файлов", "программа, выполняющая все перечисленные функции", 4
        )
        questionsList.add(que17)
        val que18 = Questions(
            18, "20. Для завершения работы системы в ОС Linux используется команда :",
            R.drawable.android_question,
            "logout", "shutdown",
            "exit", "quit", 2
        )
        questionsList.add(que18)
        val que19 = Questions(
            19, "Режимы работы редактора vi:",
            R.drawable.android_question,
            "текстовый и графический", "редактирования и копирования",
            "вставки, командный и режим командной строки", "вставки и замены", 3
        )
        questionsList.add(que19)
        val que20 = Questions(
            20, "Для установки программы в ОС Linux необходимо :",
            R.drawable.android_question,
            "выполнить команду setup", "запустить менеджер пакетов и выбрать пакет с устанавливаемой программой",
            "распаковать пакет, содержащий программу", "скопировать пакет, содержащий программу, в отдельный каталог", 2
        )
        questionsList.add(que20)
        val que21 = Questions(
            21, "Права доступа к файлу определяются :",
            R.drawable.android_question,
            "с помощью 9 символов или трехзначного шестнадцатеричного числа", "с помощью 3 символов или трехзначного восьмеричного числа",
            "с помощью 9 символов или трехзначного восьмеричного числа", "с помощью 9 символов", 3
        )
        questionsList.add(que21)
        val que22 = Questions(
            22, "Атрибуты прав доступа к файлу включают:",
            R.drawable.android_question,
            "доступ с правами администратора или пользователя;", "разграничение доступа для владельца, членов его группы и остальных пользователей;",
            "разграничение прав доступа для владельца и остальных пользователей;", "доступ «только для чтения» для всех, кроме владельца файла.", 2
        )
        questionsList.add(que22)
        val que23 = Questions(
            23, "Конфигурационные файлы в ОС Linux хранятся преимущественно:",
            R.drawable.android_question,
            "в зашифрованном виде, недоступном для просмотра;", "в зашифрованном виде, просмотр – с помощью программы-конфигуратора;",
            "в текстовом формате, просмотр и редактирование – только с помощью редактора vi;", "в текстовом формате, просмотр и редактирование – любым текстовым редактором.", 4
        )
        questionsList.add(que23)
        val que24 = Questions(
            24, "27. При страничной организации виртуальной памяти:",
            R.drawable.android_question,
            "все страницы имеют одинаковые размеры, а разбиение виртуального адресного пространства процесса на страницы выполняется системой автоматически", "размер страниц выбирается операционной системой в зависимости от объема свободной оперативной памяти",
            "размер страниц определяется программой при ее запуске", "страницы имеют одинаковый размер, количество страниц определяется программой при ее запуске", 1
        )
        questionsList.add(que24)
        val que25 = Questions(
            25, "Пользователь root — это",
            R.drawable.android_question,
            "единственная учётная запись, принадлежащая администратору системы", "учётная запись, гарантированно дающая пользователю исключительные права работы в системе",
            "учётная запись, которую рекомендуется использовать администратору системы, даже если у него имеется персональная учётная запись", "учетная запись гостя системы", 1
        )
        questionsList.add(que25)
        val que26 = Questions(
            26, "Лицензия на программное обеспечение нужна, чтобы",
            R.drawable.android_question,
            "указать, кто является обладателем всех прав на это программное обеспечение", "определить круг прав пользователя по отношению к этому программному обеспечению",
            "определить, на каких условиях можно продавать данное программное обеспечение", "сделать данное программное обеспечение свободным", 2
        )
        questionsList.add(que26)
        val que27 = Questions(
            27, "Таблица размещения файлов, где находится полная информация о кластерах:",
            R.drawable.android_question,
            "Excel", "Access",
            "FAT", "TLB", 3
        )
        questionsList.add(que27)
        val que28 = Questions(
            28, "Количество ячеек таблицы FAT соответствует количеству … на диске, а значениями ячеек являются цепочки размещения файлов, т.е. последовательности адресов … , в которых хранятся файлы",
            R.drawable.android_question,
            "данных", "файлов",
            "информации", "кластеров", 4
        )
        questionsList.add(que28)
        val que29 = Questions(
            29, "FAT12 не может использоваться для носителей информации объёмом более:",
            R.drawable.android_question,
            "позволяет устанавливать различные объёмы кластера (от 512 байтов до 64 Кбайт, по умолчанию 4 Кбайт)", "64 Кбайт . 216 = 4 Гбайт",
            "512 байтов . 212 = 2 Мбайт", "4 Кбайт . 232 = 16384 Гбайт", 3
        )
        questionsList.add(que29)
        val que30 = Questions(
            30, "FAT16 не может использоваться для носителей информации объёмом более:",
            R.drawable.android_question,
            "позволяет устанавливать различные объёмы кластера (от 512 байтов до 64 Кбайт, по умолчанию 4 Кбайт)", "64 Кбайт . 216 = 4 Гбайт",
            "4 Кбайт . 232 = 16384 Гбайт", "512 байтов . 212 = 2 Мбайт", 2
        )
        questionsList.add(que30)
        val que31 = Questions(
            31, "FAT32 не может использоваться для носителей информации объёмом более:",
            R.drawable.android_question,
            "64 Кбайт . 216 = 4 Гбайт", "позволяет устанавливать различные объёмы кластера (от 512 байтов до 64 Кбайт, по умолчанию 4 Кбайт)",
            "4 Кбайт . 232 = 16384 Гбайт", "512 байтов . 212 = 2 Мбайт", 3
        )
        questionsList.add(que31)
        val que32 = Questions(
            32, "Что присуще файловой системе NTFS?",
            R.drawable.android_question,
            "позволяет устанавливать различные объёмы кластера (от 512 байтов до 64 Кбайт, по умолчанию 4 Кбайт)", "512 байтов . 212 = 2 Мбайт",
            "4 Кбайт . 232 = 16384 Гбайт", "64 Кбайт . 216 = 4 Гбайт", 1
        )
        questionsList.add(que32)
        val que33 = Questions(
            33, "Файловая система, которая увеличивает надёжность и эффективность использования дискового пространства:",
            R.drawable.android_question,
            "NTFS", "FAT12",
            "FAT32", "FAT16", 1
        )
        questionsList.add(que33)
        val que34 = Questions(
            34, "Что присуще центру обеспечения безопасности Windows?",
            R.drawable.android_question,
            "может регулярно проверять наличие обновлений и автоматически их устанавливать", "позволяет предотвращать несанкционированные изменения в компьютере, обеспечивает защиту, запрашивая разрешение перед совершением потенциально опасных для компьютера действий",
            "защищает компьютер, предотвращает доступ к нему хакеров и вредоносных программ", "показывает текущее состояние защиты компьютера и рекомендует меры по усилению безопасности", 4
        )
        questionsList.add(que34)
        val que35 = Questions(
            35, "Что свойственно брандмауэру (межсетевому экрану) ?",
            R.drawable.android_question,
            "позволяет предотвращать несанкционированные изменения в компьютере, обеспечивает защиту, запрашивая разрешение перед совершением потенциально опасных для компьютера действий", "показывает текущее состояние защиты компьютера и рекомендует меры по усилению безопасности",
            "защищает компьютер, предотвращает доступ к нему хакеров и вредоносных программ", "может регулярно проверять наличие обновлений и автоматически их устанавливать", 3
        )
        questionsList.add(que35)
        val que36 = Questions(
            36, "Что делает автоматическое обновление?",
            R.drawable.android_question,
            "защищает компьютер, предотвращает доступ к нему хакеров и вредоносных программ", "может регулярно проверять наличие обновлений и автоматически их устанавливать",
            "показывает текущее состояние защиты компьютера и рекомендует меры по усилению безопасности", "позволяет предотвращать несанкционированные изменения в компьютере, обеспечивает защиту, запрашивая разрешение перед совершением потенциально опасных для компьютера действий", 2
        )
        questionsList.add(que36)
        val que37 = Questions(
            37, "Что позволяет делать контроль учетных записей пользователей?",
            R.drawable.android_question,
            "может регулярно проверять наличие обновлений и автоматически их устанавливать", "защищает компьютер, предотвращает доступ к нему хакеров и вредоносных программ",
            "показывает текущее состояние защиты компьютера и рекомендует меры по усилению безопасности", "позволяет предотвращать несанкционированные изменения в компьютере, обеспечивает защиту, запрашивая разрешение перед совершением потенциально опасных для компьютера действий", 4
        )
        questionsList.add(que37)
        val que38 = Questions(
            38, "О чем содержится информация в реестре Windows?",
            R.drawable.android_question,
            "оборудовании системы", "параметрах настройки, к которым ОС постоянно обращается во время работы",
            "установленных программах+", "пользователях компьютера", 1
        )
        questionsList.add(que38)
        val que39 = Questions(
            39, "Какие из представленных систем являются свободно распространяемыми?",
            R.drawable.android_question,
            "Linux", "WindowsHome",
            "WindowsXP", "Windows2000", 1
        )
        questionsList.add(que39)
        val que40 = Questions(
            40, "С помощью чего операционные системы сохраняют данные на диске?",
            R.drawable.android_question,
            "жесткого диска", "файловых систем",
            "графического интерфейса", "дисков и папок", 2
        )
        questionsList.add(que40)
        val que41 = Questions(
            41, "Что из себя представляет классическая иерархическая файловая система?",
            R.drawable.android_question,
            "рабочий стол с папками и ярлыками", "диски, папки, файлы",
            "вложенные друг в друга папки, в которых могут содержаться и файлы. Одна из папок является вершиной файловой системы, в ней содержатся все остальные папки и файлы.", "набор папок на диске С", 3
        )
        questionsList.add(que41)
        val que42 = Questions(
            42, "Сколько корневых папок содержится в операционной системе Linux?",
            R.drawable.android_question,
            "корневая папка всегда только одна", "две корневых папки",
            "корневых папок столько же сколько разделов на жестком диске", "корневых папок столько же сколько ядер", 1
        )
        questionsList.add(que42)
        val que43 = Questions(
            43, "Название подключения в одну из папок целой файловой системы, которые находятся где-то на другом устройстве:",
            R.drawable.android_question,
            "монтирование", "файловой системой",
            "размонтированием", "точкой монтирования", 1
        )
        questionsList.add(que43)
        val que44 = Questions(
            44, "Название пустой папки для монтирования?",
            R.drawable.android_question,
            "файловая система", "точка монтирования",
            "точка демонтирования", "системная папка", 2
        )
        questionsList.add(que44)
        val que45 = Questions(
            45, "Что будет означать подключённая файловая система, которую можно в любой момент отключить?",
            R.drawable.android_question,
            "смонтировать", "размонтировать",
            "демонтировать", "отформатировать", 2
        )
        questionsList.add(que45)
        val que46 = Questions(
            46, "Что чаще используют в операционной системе Linux?",
            R.drawable.android_question,
            "файловая система FAT12", "журналируемая файловая система ext3, в которой кластер может иметь размер от 1 до 8 Кбайт",
            "файловая система FAT16", "файловая система FAT32", 2
        )
        questionsList.add(que46)
        val que47 = Questions(
            47, "Что такое дистрибутив?",
            R.drawable.android_question,
            "ежедневно обновляемый репозиторий пакетов, позволяет пользователям легко обновлять свои системы и быть в курсе всех новостей мира свободных программ", "вложенные друг в друга папки, в которых могут содержаться и файлы. Одна из папок является вершиной файловой системы, в ней содержатся все остальные папки и файлы",
            "не просто набор программ, а ряд решений для различных задач пользователей, объединенных едиными системами установки, обновления и удаления программных пакетов", "команда сбора информации на уровни ядра", 3
        )
        questionsList.add(que47)
        val que48 = Questions(
            48, "… — ежедневно обновляемый репозиторий пакетов, позволяет пользователям легко обновлять свои системы и быть в курсе всех новостей мира свободных программ",
            R.drawable.android_question,
            "OpenOffice", "ALT Linux",
            "Sisyphus", "ALT Linux Junior", 3
        )
        questionsList.add(que48)
        val que49 = Questions(
            49, "В виртуальном пакете отсутствует",
            R.drawable.android_question,
            "информация о сопровождающем пакете", "информация о версии пакета",
            "информация о зависимостях", "файловый архив", 4
        )
        questionsList.add(que49)
        val que50 = Questions(
            50, "Какие две из перечисленных ниже задач решаются на сетевом уровне семейства протоколов TCP/IP?",
            R.drawable.android_question,
            "идентификация всех абонентов глобальной сети", "построение пути данных от отправителя к получателю",
            "синхронизация передачи данных в локальной сети", "гарантированная доставка данных получателю", 1
        )
        questionsList.add(que50)
        val que51 = Questions(
            51, "Чем отличается «таблица» межсетевого экрана iptables от «цепочки»?",
            R.drawable.android_question,
            "Понятие «цепочка» использовалось только в предыдущей версии межсетевого экрана Linux — ipchains. В iptables его заменили более общим понятием «таблица»", "Таблицы и цепочки следуют попеременно в произвольном порядке; по действию ACCEPT пакет может покинуть таблицу, но не цепочку",
            "Цепочки iptables состоят из нескольких таблиц; покидая одну таблицу, пакет направляется в другую", "Таблицы iptables состоят из нескольких цепочек; покидая одну цепочку, пакет направляется в другую", 3
        )
        questionsList.add(que51)
        val que52 = Questions(
            52, "Какую из перечисленных задач не выполняет X-сервер?",
            R.drawable.android_question,
            "вывод на графическое устройство", "передача данных, вводимых с клавиатуры, X-клиентам",
            "отправка X-запросов на открытие окна X-клиентам", "выдача окон X-клиентам по запросу", 3
        )
        questionsList.add(que52)
        val que53 = Questions(
            53, "Программа inkscape предназначена для",
            R.drawable.android_question,
            "Редактирования растровой графики", "Редактирования диаграмм",
            "Редактирования векторной графики", "Удобного просмотра каталoгов с изображениями", 3
        )
        questionsList.add(que53)
        val que54 = Questions(
            54, "Название Linux относится",
            R.drawable.android_question,
            "ко всем утилитам, которые могут быть запущены в Linux", "только к свободному UNIX-совместимому ядру, изначально написанному Линусом Торвальдсом",
            "ко всем утилитам GNU", "ко всем модификациям системы MINIX", 2
        )
        questionsList.add(que54)
        val que55 = Questions(
            55, "Какая из перечисленных команд не имеет отношения к справочной подсистеме Linux?",
            R.drawable.android_question,
            "man", "info",
            "whatis", "showhelp", 4
        )
        questionsList.add(que55)
        val que56 = Questions(
            56, "“/home/methody/examples” — это:",
            R.drawable.android_question,
            "полный путь", "относительный путь",
            "домашний каталог", "корневой каталог", 1
        )
        questionsList.add(que56)
        val que57 = Questions(
            57, "Пользователь может управлять фоновым процессом с помощью",
            R.drawable.android_question,
            "ввода с клавиатуры", "сигналов",
            "системных вызовов", "всеми тремя способами", 2
        )
        questionsList.add(que57)
        val que58 = Questions(
            58, "Разделяемым называется каталог",
            R.drawable.android_question,
            "предназначенный для совместного хранения файлов несколькими пользователями", "из которого пользователь не может удалить не принадлежащий ему файл",
            "в котором пользователь не может модифицировать не принадлежащий ему файл", "при просмотре которого пользователем выводятся только имена принадлежащих ему файлов", 2
        )
        questionsList.add(que58)
        val que59 = Questions(
            59, "Генерация имён файлов в bash",
            R.drawable.android_question,
            "в точности повторяет алгоритм обработки шаблонов", "основана на алгоритме обработки шаблонов, однако имеет отличия, связанные со спецификой работы с файлами",
            "использует упрощённый вариант алгоритма обработки шаблонов", "использует алгоритм «globbing», который, в отличие от генерации имён файлов в более ранних версиях shell, не основан на понятии «шаблон»", 2
        )
        questionsList.add(que59)
        val que60 = Questions(
            60, "Как, редактируя текст в Vim/Vi, сохранить текст от курсора до конца текущей строки и записать сохранённый фрагмент в самый конец файла?",
            R.drawable.android_question,
            ":.,\$yEnterGp", "yESC\$ESCGESCp",
            "y\$Gp", "y\$G\$p", 4
        )
        questionsList.add(que60)
        val que61 = Questions(
            61, "Останов системы нельзя произвести",
            R.drawable.android_question,
            "Командой halt", "Командой kill",
            "Командой shutdown", "Командой init", 2
        )
        questionsList.add(que61)
        val que62 = Questions(
            62, "Монтирование файловых систем не позволяет",
            R.drawable.android_question,
            "Собирать файловые системы различных разделов в одно дерево каталогов", "Подключать к дереву каталогов содержимое файлов, данные ядра, каталоги на других компьютерах",
            "Использовать журналирование с файловыми системами, в которых оно не предусмотрено", "Использовать различные по скорости и надёжности способы доступа к различным подкаталогам", 3
        )
        questionsList.add(que62)
        val que63 = Questions(
            63, "Способ ведения системных журналов Linux называется «централизованным», потому что",
            R.drawable.android_question,
            "Сообщения передаются одному демону syslogd, который принимает решение о распределении их по журналам", "С журналами работают различные программы, однако эта работа управляется единым файлом /etc/syslog.conf",
            "Все сообщения попадают в единую базу данных", "С журналами работают различные программы, но все сообщения имеют единый формат, пригодный для автоматического разбора", 1
        )
        questionsList.add(que63)
        val que64 = Questions(
            64, "Что означают понятия «клиент» и «сервер» на прикладном уровне TCP/IP?",
            R.drawable.android_question,
            "Клиент — тот, кто устанавливает соединение, сервер — тот, кто отвечает на него", "Клиент — тот, кто запрашивает данные, сервер — тот, кто передаёт их",
            "Сервер — тот, кто устанавливает соединение, клиент — тот, кто пользуется установленным соединением", "Сервер — это компьютер, а клиент — это программа", 1
        )
        questionsList.add(que64)
        val que65 = Questions(
            65, "Прикладные протоколы SMTP, POP3 и IMAP4",
            R.drawable.android_question,
            "Регламентируют доступ к почтовому ящику, при этом SMTP не требует идентификации пользователя, а POP3, в отличие от IMAP4, поддерживает создание пользователем почтовых ящиков на сервере", "Регламентируют пересылку почтовых сообщений между серверами, при этом SMTP-сервер работает со всеми сообщениями, а POP3 и IMAP4 — только с теми, что посланы пользователем, прошедшим процедуру идентификации, причём по протоколу POP3 письма можно только принимать, в отличие от IMAP4, который позволяет их также передавать",
            "Протокол SMTP и более защищённый протокол POP3 регламентируют пересылку почтовых сообщений между серверами, а IMAP4 — доступ к почтовому ящику", "Протокол SMTP регламентирует пересылку почтовых сообщений между компьютерами, а POP3 и IMAP4 — доступ к почтовому ящику, причём IMAP4, в отличие от POP3, поддерживает создание пользователем почтовых ящиков на сервере", 4
        )
        questionsList.add(que65)
        val que66 = Questions(
            66, "Команда startx выполняет",
            R.drawable.android_question,
            "запуск X-сервера", "запуск пользовательского сценария .xinitrc, а при его отсутствии — системного сценария xinitrc",
            "настройку окружения, запуск X-сервера и диспетчера окон или рабочего стола", "запуск X-сервера и затем X-приложений, указанных в сценарии .xinitrc пользователя, системном сценарии xinitrc или в командной строке", 4
        )
        questionsList.add(que66)
        val que67 = Questions(
            67, "При использовании алгоритмов сжатия звука «с потерей качества»",
            R.drawable.android_question,
            "Потеря качества всегда различима на слух", "Звучание исходного и сжатого файлов на слух неразличимо",
            "Из сжатого файла нельзя получить исходный, а искажения звука зависят от качества сжатия", "Достигается очень высокий процент сжатия, но получившийся файл неудобно передавать по каналам с ограниченной пропускной способностью из-за неравномерности сжатия", 3
        )
        questionsList.add(que67)
        val que68 = Questions(
            68, "Необходимость в дистрибутивах Linux возникла, когда",
            R.drawable.android_question,
            "появились пользователи, желающие установить скомпилированное ядро Linux и набор утилит на свой компьютер", "появились пользователи, готовые купить операционную систему Linux",
            "ядро Linux перестало умещаться на одной дискете", "немедленно после публикации первой версии ядра Linux", 1
        )
        questionsList.add(que68)
        val que69 = Questions(
            69, "В каком каталоге содержатся файлы, которые не могут совместно использоваться несколькими компьютерами в сети:",
            R.drawable.android_question,
            "/boot", "/home",
            "/lib", "/usr", 1
        )
        questionsList.add(que69)
        val que70 = Questions(
            70, "Доступ к каталогу на чтение означает",
            R.drawable.android_question,
            "возможность просматривать содержимое каталога: имена файлов и их атрибуты, но не сами файлы", "возможность просматривать только имена объектов, хранящихся в каталоге",
            "возможность просматривать только содержимое файлов в каталоге, но не самого каталога (имена файлов в этом случае надо знать заранее)", "выполнять любые операции над каталогом, не приводящие к изменению его содержимого", 2
        )
        questionsList.add(que70)
        val que71 = Questions(
            71, "В языке программирования sh под «выполнением условия» подразумевается",
            R.drawable.android_question,
            "значение арифметического выражения", "значение true или false",
            "результат работы команды test (“[”)", "код возврата выполненной команды", 4
        )
        questionsList.add(que71)
        val que72 = Questions(
            72, "Как, редактируя текст в Emacs, вырезать текущий абзац (в котором находится точка) и вставить его в самый конец текста?",
            R.drawable.android_question,
            "M-{ M-@ M-} M-&gt; C-w", "M-{ M-Пробел M-} M-&gt; M-y",
            "M-h M-&gt; C-y", "M-h C-w M-&gt; C-y", 4
        )
        questionsList.add(que72)
        val que73 = Questions(
            73, "Многопользовательская организация системы не позволяет",
            R.drawable.android_question,
            "Вводить различные права доступа для разных пользователей системы", "Работать нескольким пользователям одновременно",
            "Производить учёт потребления ресурсов каждым пользователем", "Одновременно использовать два или более вариантов настройки основных системных служб", 4
        )
        questionsList.add(que73)
        val que74 = Questions(
            74, "Файлу какого типа соответствует строка атрибутов “brw-rw----”?",
            R.drawable.android_question,
            "обычному файлу", "именованному каналу",
            "файлу-дырке, соответствующему устройству, из которого можно считывать и записывать информацию посимвольно", "файлу-дырке, соответствующему устройству, из которого можно считывать и записывать информацию поблочно", 4
        )
        questionsList.add(que74)
        val que75 = Questions(
            75, "Пакет всегда содержит",
            R.drawable.android_question,
            "Пред- и послеустановочные сценарии", "Одну или несколько зависимостей",
            "Утилиту или библиотеку", "Данные, добавляемые в систему при установке и удаляемые из системы при удалении пакета", 4
        )
        questionsList.add(que75)
        val que76 = Questions(
            76, "Сетевой интерфейс — это",
            R.drawable.android_question,
            "любое устройство, посредством которого компьютер присоединяется к сети", "точка взаимодействия утилит Linux с реализацией сетевых протоколов в ядре системы",
            "объект файловой системы Linux, посредством которого происходит обмен сетевыми пакетами", "разъём для присоединения сетевых устройств", 2
        )
        questionsList.add(que76)
        val que77 = Questions(
            77, "С помощью команды route можно:",
            R.drawable.android_question,
            "назначить сетевой адрес интерфейса", "добавить строку в таблицу маршрутизации IP-пакетов",
            "определить путь, проходимый IP-пакетом до пункта назначения", "определить доступность сетевого адреса", 2
        )
        questionsList.add(que77)
        val que78 = Questions(
            78, "Мефодий неудачно попытался запустить программу xterm, получив сообщение “cannot open display:”. В чём, скорее всего, была причина ошибки?",
            R.drawable.android_question,
            "Не установлена переменная окружения display", "Не запущен X-сервер",
            "Не установлена переменная окружения DISPLAY", "К компьютеру не подключён дисплей", 3
        )
        questionsList.add(que78)
        val que79 = Questions(
            79, "Название утилиты gimp расшифровывается как",
            R.drawable.android_question,
            "GNU Image Manipulation Program", "Graphic Interformat Multimedia Player",
            "GNU Instant Messaging Program", "Geographic International Map Project", 1
        )
        questionsList.add(que79)
        val que80 = Questions(
            80, "Линус Торвальдс",
            R.drawable.android_question,
            "Автор первого дистрибутива Linux", "Автор первой версии ядра Linux",
            "Автор первой операционой системы, основанной на ядре Linux", "Автор первого варианта GPL", 2
        )
        questionsList.add(que80)
        val que81 = Questions(
            81, "Управляющие символы — это",
            R.drawable.android_question,
            "Клавиши Ctrl и Alt на клавиатуре", "Символы, вводимые сочетанием любой клавиши с клавиатурным модификатором",
            "Символы, специальным образом интерпретируемые терминалом (как команды, а не как текст)", "Символы пробела и конца строки", 3
        )
        questionsList.add(que81)
        val que82 = Questions(
            82, "Полным путём в файловой системе называется",
            R.drawable.android_question,
            "Строка, включающая имя объекта файловой системы и список каталогов, в которые он последовательно вложен, начиная с корневого", "Строка, включающая имя файла и каталога, в который он вложен",
            "Строка, включающая список всех каталогов, в которых прежде находился файл, и имя этого файла", "Строка, состоящая из перечня каталогов, в которые вложен объект файловой системы, перечень может идти в любом порядке, но должен начинаться с соответствующего корневого каталога", 1
        )
        questionsList.add(que82)
        val que83 = Questions(
            83, "Команда cd",
            R.drawable.android_question,
            "Встроенная команда в любом shell", "Всегда реализована в виде утилиты",
            "Реализована в виде утилиты, но в современных версиях shell бывает встроенной", "Бывает встроенной только в случае, если используется как alias к утилите cd", 1
        )
        questionsList.add(que83)
        val que84 = Questions(
            84, "Процесс-потомок, возникший в результате выполнения системного вызова fork(), отличается от процесса-родителя",
            R.drawable.android_question,
            "именем", "окружением",
            "PID", "терминалом, с которым связан его вывод", 3
        )
        questionsList.add(que84)
        val que85 = Questions(
            85, "Чтобы определить права доступа процесса к объекту файловой системы, необходима следующая информация",
            R.drawable.android_question,
            "UID пользователя-владельца процесса, GID пользователя, ярлык объекта файловой системы", "UID пользователя-владельца процесса, полный список групп, в которые входит пользователь, ярлык объекта файловой системы",
            "только UID пользователя-владельца процесса и ярлык объекта файловой системы", "UID и GID пользователя-владельца процесса", 2
        )
        questionsList.add(que85)
        val que86 = Questions(
            86, "При запуске процесс получает",
            R.drawable.android_question,
            "три открытых дескриптора", "два открытых дескриптора",
            "один открытый дескриптор", "ни одного открытого дескриптора", 1
        )
        questionsList.add(que86)
        val que87 = Questions(
            87, "Текстовый редактор в Linux обычно не используется для",
            R.drawable.android_question,
            "Редактирования документов, содержащих, вдобавок к тексту, нетекстовую метаинформацию", "Редактирования конфигурационных файлов",
            "Редактирования неразмеченных (plain text) текстовых файлов", "Редактирования исходных текстов программ и сценариев", 1
        )
        questionsList.add(que87)
        val que88 = Questions(
            88, "Команда who предназначена для",
            R.drawable.android_question,
            "Вывода детальной информации из учётной записи указанного пользователя", "Вывода статистики использования указанным пользователем ресурсов системы",
            "Вывода списка зарегистрированных в настоящее время пользователей системы", "Вывода списка пользователей, регистрировавшихся в системе за последнее время", 3
        )
        questionsList.add(que88)
        val que89 = Questions(
            89, "В стартовом виртуальном диске (initrd) содержится",
            R.drawable.android_question,
            "ядро Linux", "все модули ядра Linux",
            "минимальный набор программ и модулей ядра, необходимый для загрузки системы", "вторичный загрузчик", 3
        )
        questionsList.add(que89)
        val que90 = Questions(
            90, "На жёстком диске, соответствующем файлу-дырке /dev/hda, три основных раздела и один расширенный, в котором содержится один дополнительный. Какой файл-дырка соответствует дополнительному разделу?",
            R.drawable.android_question,
            "/dev/hda2", "/dev/hda3",
            "/dev/hda4", "/dev/hda5", 4
        )
        questionsList.add(que90)
        val que91 = Questions(
            91, "Что означает такая строка конфигурационного файла /etc/syslog.d: mail.warning /var/log/mail?",
            R.drawable.android_question,
            "записывать в файл /var/log/mail те сообщения службы электронной почты, приоритет которых равен warning", "записывать в файл /var/log/mail те сообщения службы электронной почты, приоритет которых не ниже warning",
            "записывать в файл /var/log/mail те сообщения службы электронной почты, приоритет которых не выше warning", "записывать в файл /var/log/mail те сообщения службы электронной почты, приоритет которых не равен warning", 2
        )
        questionsList.add(que91)
        val que92 = Questions(
            92, "Менеджер пакетов занимается",
            R.drawable.android_question,
            "Размещением содержимого пакетов в файловой системе, их регистрацией, выявлением требуемых зависимостей", "Составлением списка пакетов, их классификацией и проверкой работоспособности входящих в них утилит",
            "Составлением списка пакетов, необходимых для установки или удаления, добычей этих пакетов из внешних источников, а также проверкой наличия обновлений", "Организацией альтернатив в случае появления конфликтов и последующим разрешением конфликта двух и более установленных пакетов", 3
        )
        questionsList.add(que92)
        val que93 = Questions(
            93, "Каков адрес сети, в которую входит компьютер с IP-адресом 192.168.1.13 и сетевой маской 255.255.0.0?",
            R.drawable.android_question,
            "192.168.1.0", "192.168.1.0/16",
            "192.168.0.0/16", "192.168.0.0/24", 3
        )
        questionsList.add(que93)
        val que94 = Questions(
            94, "Сколько раз производится над пакетом действие ACCEPT в процессе прохождения таблиц iptables?",
            R.drawable.android_question,
            "не более одного раза", "столько раз, сколько таблиц проходит пакет",
            "столько раз, сколько того требуют правила обработки пакета, но не более одного раза на каждую таблицу", "зависит только от количества правил в таблицах, но не от количества проходимых пакетом таблиц", 3
        )
        questionsList.add(que94)
        val que95 = Questions(
            95, "Диспетчер окон в графической системе X11",
            R.drawable.android_question,
            "встроен в X-сервер", "обладает особыми правами, так что при завершении его работы X-сервер также останавливается в обязательном порядке",
            "X-клиент, который необходимо запускать только на том же компьютере, на котором работает X-сервер", "обыкновенный X-клиент", 4
        )
        questionsList.add(que95)
        val que96 = Questions(
            96, "Служба мгновенных сообщений Jabber отличается от ICQ, AIM или Yahoo Messenger тем, что",
            R.drawable.android_question,
            "Клиентские приложения Jabber распространяются под свободной лицензией, а клиенты указанных служб в исходных текстах недоступны", "Любой желающий может организовать на своём компьютере сервер Jabber",
            "Jabber — централизованная служба, а указанные выше — распределённые", "Эти службы отличаются только спектром предоставляемых возможностей", 2
        )
        questionsList.add(que96)
        val que97 = Questions(
            97, "Можно ли продавать программное обеспечение, распространяемое под свободной лицензией?",
            R.drawable.android_question,
            "Да, такое требование входит в определение свободного ПО", "Нет, это противоречит требованиям к свободному ПО",
            "Да, если это не противоречит конкретной лицензии: общие требования к свободному ПО не оговаривают условия продажи", "Требования к свободному ПО не оговаривают условия продажи, однако многие распространённые лицензии, например, GPL, это запрещают", 3
        )
        questionsList.add(que97)
        val que98 = Questions(
            98, "Запись program(5) обозначает",
            R.drawable.android_question,
            "пятую версию программы program", "программу program, вызванную с пятью параметрами",
            "страницу руководства по пятой версии программы program", "страницу руководства по программе program, относящуюся к пятому разделу системы руководств", 4
        )
        questionsList.add(que98)
        val que99 = Questions(
            99, "Каталог /var предназначен для",
            R.drawable.android_question,
            "хранения конфигурационных файлов в формате переменная=значение", "хранения файлов, назначение которых может меняться в процессе работы системы или не определено",
            "хранения файлов, которые, согласно классификации, не могут быть помещены в другие каталоги системы — /etc, /bin, /lib и т. п.", "хранения данных, которые создаются в процессе работы разными программами и предназначены для передачи другим программам и системам", 4
        )
        questionsList.add(que99)
        val que100 = Questions(
            100, "Какой вид доступа необходим (и достаточен), чтобы удалить файл, если известно его имя?",
            R.drawable.android_question,
            "доступ на запись к файлу", "доступ на запись к каталогу, в котором находится файл",
            "доступ на использование к каталогу, в котором находится файл и на запись — к самому файлу", "доступ на запись и использование к каталогу, в котором находится файл", 4
        )
        questionsList.add(que100)
        val que101 = Questions(
            101, "Команда tr предназначена для",
            R.drawable.android_question,
            "Перевода с одного естественного языка на другой", "Трансляции командных сценариев",
            "Изменения порядка полей в потоке данных", "Замены одних символов в потоке данных на другие", 4
        )
        questionsList.add(que101)
        val que102 = Questions(
            102, "Какой список файлов может сгенерировать shell по шаблону *r*[cC]",
            R.drawable.android_question,
            "bash.rc .bashrc BarC rrrc", "tric rcC] r.C mail.rc",
            "oroc ir/ac arc r@C", "*rcC CrooC crc or..c", 4
        )
        questionsList.add(que102)
        val que103 = Questions(
            103, "В редакторе Vi много команд перемещения по тексту, потому что",
            R.drawable.android_question,
            "Эти команды проще всего реализовать однократным нажатием на клавишу", "Эти команды используются намного чаще других",
            "Перемещение с помощью «стрелочек» в редакторе Vi не работает", "Эти команды используются как составная часть основных команд редактирования", 4
        )
        questionsList.add(que103)
        val que104 = Questions(
            104, "Какие действия будут выполнены по команде init 3",
            R.drawable.android_question,
            "будет запущена программа init с PID равным 3", "система перейдёт на уровень выполнения 3, для чего будут запущены все системные службы, которые должны работать на этом уровне",
            "система перейдёт на уровень выполнения 3, для чего будут запущены те из необходимых на этом уровне служб, которые ещё не были запущены, а также будут остановлены те из работающих служб, которые на уровне 3 выполняться не должны", "номер текущего уровня выполнения будет изменён на 3, для чего не требуется запуск или остановка системных служб", 3
        )
        questionsList.add(que104)
        val que105 = Questions(
            105, "Как добиться того, чтобы файловая система не монтировалась автоматически при загрузке системы, но могла быть смонтирована вручную командой mount точка_монтирования?",
            R.drawable.android_question,
            "при первом монтировании этой файловой системы добавить в командую строку настройку noauto", "при размонтировании этой файловой системы добавить в командную строку настройку noauto",
            "не описывать эту файловую систему в /etc/fstab", "описать эту файловую систему в /etc/fstab, добавив noauto в список настроек монтирования", 4
        )
        questionsList.add(que105)
        val que106 = Questions(
            106, "Какова функция демона anacron?",
            R.drawable.android_question,
            "выполнять действия по ежедневной профилактике системы", "автоматически выполнять действия по расписанию, когда наступает соответствующий момент",
            "автоматически выполнять действия по расписанию, а если они по какой-либо причине не были выполнены вовремя — выполнять их, как только это становится возможным", "автоматически выполнять запланированные действия в случайное время, чтобы не загружать компьютер работой", 3
        )
        questionsList.add(que106)
        val que107 = Questions(
            107, "Конфликт двух пакетов происходит в случае, когда",
            R.drawable.android_question,
            "Два одинаковых пакета называются по-разному", "Два разных пакета имеют одно и то же название",
            "Два разных пакета содержат хотя бы по одному файлу, полные пути которых совпадают", "Два разных пакета содержат хотя бы по одному файлу, полные пути которых совпадают, а содержимое различно", 3
        )
        questionsList.add(que107)
        val que108 = Questions(
            108, "В файле /etc/hosts содержится",
            R.drawable.android_question,
            "список активных сетевых подключений", "список серверов DNS, которые следует использовать при подключении к Internet",
            "соответствия названий сетевых протоколов номерам постоянно закреплённых за ними портов", "соответствия IP-адресов именам компьютеров в сети", 4
        )
        questionsList.add(que108)
        val que109 = Questions(
            109, "Обмен данными по какому из перечисленных прикладных протоколов затруднительно защитить при помощи SSL?",
            R.drawable.android_question,
            "HTTP", "SMTP",
            "IMAP", "FTP", 4
        )
        questionsList.add(que109)
        val que110 = Questions(
            110, "Виртуальный экран",
            R.drawable.android_question,
            "То же, что и виртуальный сервер", "Отличается от \"настоящего\" экрана ненулевым номером в адресе X-сервера (например, :5)",
        "Экран X-сервера, содержимое которого недоступно пользователю", "Организуется диспетчером окон", 4
        )
        questionsList.add(que110)
        val que111 = Questions(
            111, "Система подготовки печатной документации LaTeX",
            R.drawable.android_question,
            "Обладает простым и интуитивно понятным интерфейсом, позволяющим новичку создавать высококачественные документы", "Представляет собой только соглашение о формате файлов и набор утилит, а основную работу по форматированию производят текстовые редакторы, такие как LyX и emacs",
            "Рассчитана на профессионального пользователя, поэтому никаких средств, позволяющих работать в ней новичку, не предусмотрено", "Высокоуровневая надстройка над TeX, ориентированная на решение типичных задач оформления. Формат LaTeX используется редактором LyX, предоставляющим визуальные средства редактирования документа", 4
        )
        questionsList.add(que111)
        val que112 = Questions(
            112, "\"Дистрибутив Linux\" - это",
        R.drawable.android_question,
        "операционная система на основе ядра Linux и утилит GNU", "комплект программного обеспечения, на основе которого можно получить операционную систему с ядром Linux",
        "бесплатный комплект программного обеспечения, на основе которого можно получить операционную систему, аналогичную коммерческим ОС", "копия операционной системы Linux, помещённая на CD или DVD и снабжённая программой установки, переносящей её на жёсткий диск", 2
        )
        questionsList.add(que112)
        val que113 = Questions(
            113, "Сколько параметров (не считая ключей) передано утилите в команде grep -ln --max-count=3 \"key switch\" option",
        R.drawable.android_question,
        "ни одного", "1",
        "2", "3", 3
        )
        questionsList.add(que113)
        val que114 = Questions(
            114, "Из символов “.”, “:”, “/” и “\"\" в именах файлов файловой системы Linux запрещено использовать",
        R.drawable.android_question,
        "Все символы", "Символы “.”, “/” и “\"”",
        "Символы “/” и “.”", "Только “/”", 4
        )
        questionsList.add(que114)
        val que115 = Questions(
            115, "Идентификаторы обычных пользователей не могут принимать значения:",
            R.drawable.android_question,
            "0", "1",
            "100", "100000", 1
        )
        questionsList.add(que115)
        val que116 = Questions(
            116, "Вторичный загрузчик — это",
            R.drawable.android_question,
            "Программа, распознающая как минимум один тип файловой системы, задача которой — найти в этой файловой системе и запустить загрузчик ядра", "Программа, способная загружать ядро операционной системы и настраивать его",
            "Программно реализованная часть загрузки системы, в отличие от первичного загрузчика, реализованного аппаратно", "Программа, работающая с полным вариантом системы, в отличие от первичного загрузчика, работающего со стартовым виртуальным диском", 2
        )
        questionsList.add(que116)
        val que117 = Questions(
            117, "Старший и младший номера устройства определяют",
            R.drawable.android_question,
            "Начало и конец описателя устройства в таблицах ядра", "Какой драйвер системы и  каким способом выполняет операции с этим устройством",
            "Порядок, в котором устройства распознавались ядром", "Числа, которые программа должна использовать вместо дескриптора файла при операциях записи и чтения", 2
        )
        questionsList.add(que117)
        val que118 = Questions(
            118, "Конфигурационный файл в Linux, как правило, не предназначен для",
            R.drawable.android_question,
            "Автоматического разбора программой", "Чтения пользователем",
            "Редактирования пользователем", "Отражения текущего состояния работающей службы", 4
        )
        questionsList.add(que118)
        val que119 = Questions(
            119, "Какое из перечисленных действий не выполняется при установке пакета установщиком пакетов?",
            R.drawable.android_question,
            "копирование пакета из репозитория в систему", "доустановочные сценарии",
            "копирование файлов из пакета в систему", "послеустановочные сценарии", 1
        )
        questionsList.add(que119)
        val que120 = Questions(
            120, "На каком уровне передаётся больше данных при копировании одного файла, при условии, что сжатие данных не производится?",
            R.drawable.android_question,
            "На аппаратном/интерфейсном", "На прикладном",
            "Зависит от протокола прикладного уровня", "Зависит от реализации сетевых протоколов на отправителе, получателе и маршрутизаторах", 1
        )
        questionsList.add(que120)
        val que121 = Questions(
            121, "Какие сетевые параметры можно настроить с помощью стандартного протокола BOOTP?",
            R.drawable.android_question,
            "IP-адреса клиента, сервера и маршрутизатора, а также имя загрузочного файла", "только IP-адрес клиента и IP-адрес сервера",
            "IP-адреса клиента, сервера, маршрутизатора и сервера доменных имён, а также имена файла-загрузчика и файла с ядром системы", "то же, что и в предыдущем случае, плюс доменное имя клиента и срок действия полученного IP-адреса (lease)", 1
        )
        questionsList.add(que121)
        val que122 = Questions(
            122, "Если в X Window System окно получило фокус, это означает, что",
            R.drawable.android_question,
            "в этом окне находится указатель мыши", "задача, которой принадлежит это окно, получит события ввода от системы",
            "задача, которой принадлежит это окно, получит возможность вводить и выводить данные", "задача, которой принадлежит это окно, будет выполняться, пока фокус находится в этом окне", 2
        )
        questionsList.add(que122)
        val que123 = Questions(
            123, "Почтовая программа Thunderbird — это",
            R.drawable.android_question,
            "Часть программного продукта Mozilla, занимающаяся электронной почтой", "Самостоятельный программный продукт, сделанный на основе исходных текстов Mozilla Mail",
            "Самостоятельный программный продукт, задача которого — повторить интерфейс почтового клиента для Windows, облегчая тем самым процесс перехода к Linux", "Часть программного продукта OpenOffice.org, занимающаяся электронной почтой", 2
        )
        questionsList.add(que123)
        val que124 = Questions(
            124, "Простейшая командная строка состоит из",
            R.drawable.android_question,
            "Одной команды", "Команды и её параметров (не менее одного)",
            "Приглашения и команды", "Приглашения, команды и её параметров (не менее одного)", 1
        )
        questionsList.add(que124)
        val que125 = Questions(
            125, "Файловая система — это:",
            R.drawable.android_question,
            "все файлы, хранящиеся на всех информационных носителях", "все подкаталоги корневого каталога",
            "раздел информационного носителя, используемый Linux для хранения данных", "способ организации доступа к файлам на информационном носителе или его разделе", 4
        )
        questionsList.add(que125)
        val que126 = Questions(
            126, "Текущий каталог определён для:",
            R.drawable.android_question,
            "каждого пользователя, зарегистрированного в системе", "каждой выполняемой программы (процесса)",
            "каждого каталога файловой системы", "каждой командной оболочки пользователя", 2
        )
        questionsList.add(que126)
        val que127 = Questions(
            127, "Алгоритм запуска программы в качестве дочернего процесса в Linux:",
            R.drawable.android_question,
            "создание нового «пустого» процесса, загрузка программы из файла, запуск", "дублирование текущего процесса, запуск новой программы вместо одной из получившихся копий",
            "стандартный запуск программы с параметром, предписывающим системе не завершать текущий процесс, а породить новый", "любой запуск программы приводит в Linux к появлению дочернего процесса", 2
        )
        questionsList.add(que127)
        val que128 = Questions(
            128, "Чем определяются права доступа процесса к файлу?",
            R.drawable.android_question,
            "UID и GID процесса и ярлыком файла", "UID процесса, списком GID, членом которых является пользователь, запустивший этот процесс, и ярлыком файла",
            "UID процесса и файла и списком GID, членом которых является хозяин процесса", "UID процесса и файла и двумя списками GID, членами которых являются, соответственно, хозяин процесса и хозяин файла", 2
        )
        questionsList.add(que128)
        val que129 = Questions(
            129, "Фильтр — это:",
            R.drawable.android_question,
            "программа, которая читает со стандартного ввода, а выводит на стандартный вывод", "связанная пара дескрипторов, где данные, записанные на входной дескриптор, сразу доступны для чтения с выходного",
            "то же, что и файл-дырка", "труба, в которую отправляются данные", 1
        )
        questionsList.add(que129)
        val que130 = Questions(
            130, "Понятие «достраивание» означает",
            R.drawable.android_question,
            "подстановку списка файлов вместо заданного шаблона", "автоматическое именование файлов в групповых операциях",
            "подстановку оболочкой недостающей части командной строки, вычисляемой по уже введённой части командной строки", "преобразование командной строки непосредственно перед вызовом команды", 3
        )
        questionsList.add(que130)
        val que131 = Questions(
            131, "Разметка — это:",
            R.drawable.android_question,
            "любая служебная информация в текстовом файле (редакторские правки, комментарии, инструкции и т. п.)", "непечатные (не отображаемые на экране терминала) символы в текстовом файле",
            "инструкции по обработке текста, вид которых оговаривается специальным соглашением (форматом разметки)", "инструкции по преобразованию текста в некоторый другой формат (например, для просмотра браузером)", 3
        )
        questionsList.add(que131)
        val que132 = Questions(
            132, "Программа last выводит:",
            R.drawable.android_question,
            "список команд, введённых пользователем", "последнюю команду, выполненную пользователем",
            "идентификатор последнего зарегистрировавшегося в системе пользователя", "список последних работавших пользователей", 4
        )
        questionsList.add(que132)
        val que133 = Questions(
            133, "Стартовый виртуальный диск позволяет",
            R.drawable.android_question,
            "Загрузить Linux с носителя, драйверы которого отсутствуют в ядре и модулях", "Загрузить урезанный вариант Linux для того, чтобы использовать драйверы, находящиеся в модулях",
            "С помощью драйверов, находящихся в модулях, подключать дополнительные носители при переходе на некоторый уровень выполнения", "Загрузить урезанный вариант Linux, эквивалентный однопользовательскому режиму работы полностью загруженной системы", 2
        )
        questionsList.add(que133)
        val que134 = Questions(
            134, "Устройство /dev/hdb5 соответствует",
            R.drawable.android_question,
            "Разделу «b» пятого диска системы", "Пятому основному разделу гибкого диска «b:»",
            "Первому дополнительному разделу второго диска системы", "Пятому дополнительному разделу второго диска системы", 4
        )
        questionsList.add(que134)
        val que135 = Questions(
            135, "В каком виде хранится пользовательский пароль в файле shadow?",
            R.drawable.android_question,
            "Как обычный текст, так как этот файл доступен только суперпользователю", "В зашифрованном виде, причём расшифровать пароль может только суперпользователь",
            "В зашифрованном виде, причём расшифровать пароль невозможно", "В shadow нет никакой информации о пользовательских паролях", 3
        )
        questionsList.add(que135)
        val que136 = Questions(
            136, "Целостная система может содержать",
            R.drawable.android_question,
            "пакеты с неудовлетворёнными зависимостями", "конфликтующие пакеты",
            "необновлённые пакеты", "несколько версий одного и того же пакета", 3
        )
        questionsList.add(que136)
        val que137 = Questions(
            137, "Какие две из перечисленных ниже задач решаются на транспортном уровне семейства протоколов TCP/IP?",
            R.drawable.android_question,
            "Проверка, в состоянии ли адресат получать данные", "Передача отправителю сведений о том, сколько ещё данных готов получить адресат",
            "Выбор оптимального режима передачи в зависимости от типа передаваемых данных", "Передача отправителю сведений о том, когда адресат будет готов получить очередную порцию данных", 1
        )
        questionsList.add(que137)
        val que138 = Questions(
            138, "Какие пакеты можно успешно передавать через сервер подмены сетевых адресов (NAT)?",
            R.drawable.android_question,
            "Только TCP и UDP-пакеты", "Любые пакеты, предусматривающие не только поле «адрес отправителя», но также поля «адрес получателя» и «порт».",
            "Любые пакеты, которые можно гарантированно отличить друг от друга, не используя поле «IP-адрес отправителя».", "Любые пакеты, которые можно гарантированно отличить друг от друга, не используя поле «IP-адрес отправителя». Если протокол требует ответа на передаваемый пакет, ответные пакеты также должны быть однозначно идентифицируемы по полям, отличным от IP-адреса отправителя", 4
        )
        questionsList.add(que138)
        val que139 = Questions(
            139, "Виртуальный X-сервер отличается от обычного X-сервера",
            R.drawable.android_question,
            "тем, что запускается всегда на удалённой машине", "тем, что не принимает запросы от X-клиентов",
            "тем, что не связан с устройством графического вывода", "адресом", 3
        )
        questionsList.add(que139)
        val que140 = Questions(
            140, "POSIX — это",
            R.drawable.android_question,
            "UNIX-совместимая операционная система", "любая свободная операционная система",
            "стандарт, описывающий функциональную модель UNIX-совместимой операционной системы", "стандарт, описывающий функциональную модель любой операционной системы", 3
        )
        questionsList.add(que140)
        val que141 = Questions(
            141, "Ключ команды — это",
            R.drawable.android_question,
            "Однобуквенный параметр командной строки", "Полнословный параметр командной строки",
            "Параметр командной строки специального формата", "Модификатор поведения команды, разделяющий команду и её параметры", 3
        )
        questionsList.add(que141)
        val que142 = Questions(
            142, "Сколько расширений может иметь файл в Linux:",
            R.drawable.android_question,
            "одно", "два",
            "до трёх", "в файловой системе Linux нет понятия «расширение», поэтому им воспользоваться невозможно", 4
        )
        questionsList.add(que142)
        val que143 = Questions(
            143, "“../../share/doc/” — это:",
            R.drawable.android_question,
            "полный путь", "относительный путь",
            "текущий каталог", "имя файла", 2
        )
        questionsList.add(que143)
        val que144 = Questions(
            144, "Что такое «подмена идентификатора»?",
            R.drawable.android_question,
            "механизм наследования процессом соответствующего идентификатора не от родительского процесса, а из ярлыка запускаемого файла", "механизм временной смены процессом соответствующего идентификатора на основании содержимого таблиц su или sudo",
            "механизм выполнения пользователем действий с чужими правами доступа, управляемый командой umask", "наименование способа, которым достигается несанкционированный доступ к неаккуратно настроенным Linux-системам", 1
        )
        questionsList.add(que144)
        val que145 = Questions(
            145, "Окружение — это",
            R.drawable.android_question,
            "набор переменных shell", "данные, которые процесс получает от родительского процесса, и может ими пользоваться, даже если не описывал их заранее",
            "данные, которые процесс получает от родительского процесса, и может ими пользоваться для передачи информации в родительский процесс (если они проэкспортированы)", "список процессов, взаимодействующих с данным посредством команды export", 2
        )
        questionsList.add(que145)
        val que146 = Questions(
            146, "Как, редактируя текст в Vi, удалить текст от курсора вплоть до следующего употребления того слова, на котором стоит курсор, и выйти, сохранив изменения в файле?",
            R.drawable.android_question,
            "d*ZZ", "y*:wq",
            "d/нужное_слово:q!", "c/нужное_слово:w", 1
        )
        questionsList.add(que146)
        val que147 = Questions(
            147, "Стартовый сценарий системной службы",
            R.drawable.android_question,
            "Записывается в /etc/init.d", "Записывается в каталоги /etc/rc.d и /etc/rc.d/rc*.d",
            "Записывается в /etc/rc.d/init.d, а в каталогах /etc/rc.d/rc*.d помещаются символьные ссылки на него", "Записывается в каталог /etc/rc.d, а в каталогах /etc/rc.d/init.d и /etc/rc.d/rc*.d помещаются символьные ссылки на него", 3
        )
        questionsList.add(que147)
        val que148 = Questions(
            148, "Системная область — это",
            R.drawable.android_question,
            "Часть файловой системы, отведённая под метаданные, не имеющие прямого отношения к содержимому файлов", "Часть файловой системы, отведённая под системные файлы",
            "Часть файловой системы, отведённая под служебные данные, не имеющие отношения к самим файлам этой файловой системы", "Часть файловой системы, содержащая программы, драйверы и прочие инструменты, необходимые для работы с этой файловой системой", 1
        )
        questionsList.add(que148)
        val que149 = Questions(
            149, "Как в etc/crontab выглядит запуск сценария /bin/boo только по 13-м числам в пятницу, в полдень?",
            R.drawable.android_question,
            "12 00 13 * 5 root /bin/boo", "* 12 13 * 5 root /bin/boo",
            "0 12 13 * 5 root /bin/boo", "Такое сочетание дат для cron невозможно", 3
        )
        questionsList.add(que149)
        val que150 = Questions(
            150, "Какие две из перечисленных задач выполняет служба доменных имён?",
            R.drawable.android_question,
            "Преобразует доменное имя в IP-адрес и обратно", "Преобразует доменное имя в IP-адрес с сетевой маской и обратно",
            "Предоставляет информацию о сервере электронной почты и серверах имён в поддоменах", "Предоставляет информацию о маршрутизаторах в сети домена", 1
        )
        questionsList.add(que150)
        val que151 = Questions(
            151, "В чём причина введения Secure Socket Layer (SSL) во многие сетевые службы?",
            R.drawable.android_question,
            "В этих протоколах используются слишком старые алгоритмы шифрования, которые легко поддаются несанкционированной расшифровке на современной технике", "Текстовые протоколы этих служб не предусматривают сокрытие передаваемых учётных данных (например, пароля и входного имени)",
            "В необходимости, во избежание злоупотреблений, вводить процедуру идентификации даже в те службы, которые её не предусматривали", "В том, что ни одна из этих служб не поддерживает именно алгоритма шифрования с асимметричными ключами, предоставляемого SSL", 2
        )
        questionsList.add(que151)
        val que152 = Questions(
            152, "По команде startx X-приложение будет запущен",
            R.drawable.android_question,
            "сеанс X11, в котором может выполняться только одно X-приложение", "сеанс X11, лидером которого будет X-приложение",
            "сеанс X11, после завершения которого будет запущено X-приложение", "X-сервер и X-приложение. Когда X-приложение завершается, оно запускается заново", 2
        )
        questionsList.add(que152)
        val que153 = Questions(
            153, "В каком из перечисленных каталогов файлы не должны изменяться без вмешательства системного администратора:",
            R.drawable.android_question,
            "/home", "/usr",
            "/var", "/tmp", 2
        )
        questionsList.add(que153)
        val que154 = Questions(
            154, "Сценарий — это",
            R.drawable.android_question,
            "любой фрагмент файла, содержащий команды командного интерпретатора", "любой текстовый файл, в начале которого есть строка вида “#!интерпретатор”",
            "любой исполняемый файл", "исполняемый текстовый файл", 4
        )
        questionsList.add(que154)
        val que155 = Questions(
            155, "Какой номер дескриптора получит файл “file2” в таком случае: cat &lt; file1 | sort &gt; file2",
            R.drawable.android_question,
            "0", "1",
            "2", "3", 2
        )
        questionsList.add(que155)
        val que156 = Questions(
            156, "В файл .inputrc записывается",
            R.drawable.android_question,
            "информация о соответствии вводимых символов выполняемым библиотекой readline функциям", "информация о соответствии вводимых символов командам bash",
            "информация о соответствии функций библиотеки readline командам bash", "реализация функций редактирования командной строки", 1
        )
        questionsList.add(que156)
        val que157 = Questions(
            157, "Как, редактируя текст в Emacs, вставить в точке фрагмент текста, который был удалён предпоследним?",
            R.drawable.android_question,
            "M-y", "C-y M-y",
            "M-y M-y", "M-y C-y", 2
        )
        questionsList.add(que157)
        val que158 = Questions(
            158, "Файлу какого типа соответствует строка атрибутов “crw-rw----”?",
            R.drawable.android_question,
            "обычному файлу", "именованному каналу",
            "файлу-дырке, соответствующему устройству, из которого можно считывать и записывать информацию посимвольно", "файлу-дырке, соответствующему устройству, из которого можно считывать и записывать информацию поблочно", 3
        )
        questionsList.add(que158)
        val que159 = Questions(
            159, "Зависимость одного rpm-пакета от другого означает, что",
            R.drawable.android_question,
            "Программное обеспечение первого пакета не может работать без содержимого второго", "Информацию об первом пакете нельзя получить, не зная информации о втором",
            "Зависимый пакет не может быть успешно установлен без того, от которого он зависит", "Ни один из двух пакетов не может быть установлен без другого", 3
        )
        questionsList.add(que159)
        val que160 = Questions(
            160, "Аппаратный адрес есть у каждого",
            R.drawable.android_question,
            "компьютера", "компьютера, подключённого к сети Internet",
            "сетевого устройства внутри определённых сред передачи данных, например, Ethernet-карты", "сетевого интерфейса", 3
        )
        questionsList.add(que160)
        val que161 = Questions(
            161, "Назначать маршрутизатор по умолчанию следует при помощи",
            R.drawable.android_question,
            "утилиты ifconfig", "утилиты route",
            "редактирования файла ifcfg-eth0", "редактирования файла /etc/resolv.conf", 2
        )
        questionsList.add(que161)
        val que162 = Questions(
            162, "В адрес X-сервера обязательно должно входить поле, содержащее",
            R.drawable.android_question,
            "IP-адрес компьютера, на котором он запущен", "Номер X-сервера",
            "Номер экрана", "Способ доступа к X-серверу", 2
        )
        questionsList.add(que162)
        val que163 = Questions(
            163, "Название утилиты xmms расшифровывается как",
            R.drawable.android_question,
            "X MultiMedia System", "eXtented Message Manipulation System",
            "X Module Manipulation Set", "eXtented Micro Machines System", 1
        )
        questionsList.add(que163)
        val que164 = Questions(
            164, "Ричард Столлман",
            R.drawable.android_question,
            "Автор первого дистрибутива Linux", "Автор первой версии ядра Linux",
            "Автор первой операционой системы, основанной на ядре Linux", "Автор первого варианта GPL", 4
        )
        questionsList.add(que164)
        val que165 = Questions(
            165, "Управляющая последовательность — это",
            R.drawable.android_question,
            "последовательность клавиш, начинающаяся с клавиатурного модификатора (например, Ctrl или Alt)", "последовательность символов определённой длины, начинающаяся с управляющего символа и интерпретируемая системой как команда, введённая с терминала",
            "последовательность символов определённой длины, начинающаяся с управляющего символа и интерпретируемая терминалом как команда", "последовательность символов любой длины, начинающаяся с управляющего символа “^[” и заканчивающаяся переводом строки", 3
        )
        questionsList.add(que165)
        val que166 = Questions(
            166, "Деревом каталогов в файловой системе Linux называется",
            R.drawable.android_question,
            "Упорядоченный список всех доступных каталогов файловой системы", "Структура, состоящая из каталогов, связанных отношением вложенности. Каждый каталог, кроме корневого, непосредственно вложен ровно в один какой-нибудь другой каталог",
            "Структура, состоящая как из каталогов, связанных отношением вложенности, так и из отдельных каталогов. Каталог может быть непосредственно вложен не более, чем в один какой-нибудь другой каталог", "Структура, состоящая из каталогов, связанных отношением вложенности. Каждый каталог, кроме корневого, может быть вложен в несколько других каталогов, не вложенных друг в друга", 2
        )
        questionsList.add(que166)
        val que167 = Questions(
            167, "Чем фоновый процесс отличается от активного?",
            R.drawable.android_question,
            "фоновый процесс не выполняется, пока не станет активным", "фоновый процесс не имеет возможности вводить данные с того же терминала, на который он их выводит",
            "фоновый процесс имеет более высокий приоритет и получает больше ресурсов", "ничем не отличается", 2
        )
        questionsList.add(que167)
        val que168 = Questions(
            168, "Для определения прав доступа процесса к объекту файловой системы не требуется",
            R.drawable.android_question,
            "UID пользователя-владельца процесса", "полный список групп, в которые входит пользователь-владелец процесса",
            "тип объекта (файл, каталог, файл-дырка и т. д.)", "ярлык объекта файловой системы", 3
        )
        questionsList.add(que168)
        val que169 = Questions(
            169, "Кто открывает файл при перенаправлении в него стандартного вывода команды с помощью “&gt;”?",
            R.drawable.android_question,
            "Командный интерпретатор", "Запускаемый новый процесс",
            "Два предыдущих варианта, в зависимости от того, является ли команда внутренней для командного интерпретатора (как, например, cd или export)", "При перенаправлении вывода в файл открытия этого файла не происходит", 1
        )
        questionsList.add(que169)
        val que170 = Questions(
            170, "Что означает понятие «режимы» в Vim и Emacs?",
            R.drawable.android_question,
            "Состояния текстового редактора, в которых он по-разному обрабатывает нажатия на одни и те же алфавитно-цифровые клавиши", "Наборы команд, предназначенные для работы с текстами различной структуры",
            "Способы ввода команд и вывода текста, зависящие от параметров устройств ввода-вывода", "Ни одно из предложенных определений не подходит к Vim и Emacs сразу", 4
        )
        questionsList.add(que170)
        val que171 = Questions(
            171, "Модули ядра Linux",
            R.drawable.android_question,
            "никогда не требуются для загрузки системы", "всегда требуются для загрузки системы",
            "представляют собой части ядра, которые могут быть загружены в память или удалены оттуда только специальными утилитами", "представляют собой обычные процессы, которыми можно управлять посредством сигналов", 3
        )
        questionsList.add(que171)
        val que172 = Questions(
            172, "На жёстком диске, соответствующем файлу-дырке /dev/hda, один основной раздел и один расширенный, в котором содержится один дополнительный. Какой файл-дырка соответствует дополнительному разделу?",
            R.drawable.android_question,
            "/dev/hda2", "/dev/hda3",
            "/dev/hda4", "/dev/hda5", 4
        )
        questionsList.add(que172)
        val que173 = Questions(
            173, "Что означает такая строка конфигурационного файла /etc/syslog.d: *.info /var/log/messages?",
            R.drawable.android_question,
            "записывать в файл /var/log/messages все сообщения, приоритет которых равен info", "записывать в файл /var/log/messages все сообщения, приоритет которых не ниже info",
            "записывать в файл /var/log/messages все сообщения, приоритет которых не выше info", "записывать в файл /var/log/messages все сообщения службы info", 2
        )
        questionsList.add(que173)
        val que174 = Questions(
            174, "Установщик пакетов занимается",
            R.drawable.android_question,
            "Размещением содержимого пакетов в файловой системе, их регистрацией, выявлением требуемых зависимостей", "Составлением списка пакетов, их классификацией и проверкой работоспособности входящих в них утилит",
            "Составлением списка пакетов, необходимых для установки или удаления, добычей этих пакетов из внешних источников, а также проверкой наличия обновлений", "Организацией альтернатив в случае появления конфликтов и последующим разрешением конфликта двух и более установленных пакетов", 1
        )
        questionsList.add(que174)
        val que175 = Questions(
            175, "Каков адрес сети, в которую входит компьютер с IP-адресом 192.168.0.13 и сетевой маской 255.255.255.0?",
            R.drawable.android_question,
            "192.168.0.0", "192.168.1.0/16",
            "192.168.0.0/16", "192.168.0.0/24", 4
        )
        questionsList.add(que175)
        val que176 = Questions(
            176, "Сколько раз производится над пакетом действие DROP в процессе прохождения таблиц iptables?",
            R.drawable.android_question,
            "не более одного раза", "столько раз, сколько таблиц проходит пакет",
            "столько раз, сколько того требуют правила обработки пакета, но не более одного раза на каждую таблицу", "зависит только от количества правил в таблицах, но не от количества проходимых пакетом таблиц", 1
        )
        questionsList.add(que176)
        val que177 = Questions(
            177, "Мефодий «ухватил» окно xterm за уголок и увеличил его. Какие программы, помимо xterm, были в этом задействованы.",
            R.drawable.android_question,
            "диспетчер окон и X-сервер", "только X-сервер",
            "только диспетчер окон", "только xterm", 1
        )
        questionsList.add(que177)
        val que178 = Questions(
            178, "Для того, чтобы запустить несколько приложений с текстовым интерфейсом на удалённом компьютере, необходимо",
            R.drawable.android_question,
            "Воспользоваться клиентом Secure Shell на рабочей станции и утилитой screen на удалённом компьютере", "Запустить несколько эмуляторов терминала на рабочей станции, и в каждом из них воспользоваться клиентом Secure Shell",
            "Воспользоваться клиентом Secure Shell на рабочей станции с предоставлением виртуального X-сервера на удалённой машине, после чего запустить с удалённой машины несколько эмуляторов терминала", "Подходит любой из перечисленных выше способов, однако первый не требует наличия графической подсистемы ни на рабочей станции, ни на удалённой машине", 4
        )
        questionsList.add(que178)
        val que179 = Questions(
            179, "Общественная лицензия GNU, вдобавок к основным свойствам свободной лицензии,",
            R.drawable.android_question,
            "Запрещает коммерческое использование ПО", "Запрещает не согласованную с автором модификацию ПО",
            "Запрещает распространение этого ПО (или его модификации) под какой бы то ни было другой лицензией", "Запрещает распространение этого ПО (или его модификации) под лицензией, нарушающей требования к свободному ПО", 4
        )
        questionsList.add(que179)
        val que180 = Questions(
            180, "Чтобы получить список объектов системы, имеющих отношение к электронной почте, с краткими описанием каждого объекта, следует выполнить команду:",
            R.drawable.android_question,
            "info mail", "man mail",
            "apropos mail", "whatis mail", 3
        )
        questionsList.add(que180)
        val que181 = Questions(
            181, "Каталог /usr предназначен для",
            R.drawable.android_question,
            "Хранения пользовательской информации — домашних каталогов, самостоятельно установленных пакетов и каталогов совместного использования", "Хранения большинства файлов разного назначения, доступных пользователям на чтение и не использующихся в процедурах начальной загрузки и аварийного обслуживания системы",
            "Хранения пользовательской информации, предназначенной для совместного использования и изменения, кроме домашних каталогов пользователей", "Хранения только системных файлов, недоступных обычному пользователю, а самой системе доступных только на чтение (за исключением процедур начальной загрузки и аварийного обслуживания)", 2
        )
        questionsList.add(que181)
        val que182 = Questions(
            182, "Процесс, которому передан сигнал INT (“^C”)",
            R.drawable.android_question,
            "немедленно прекратит исполняться и будет удалён из таблицы процессов", "немедленно прекратит исполняться, но не будет удалён из таблицы процессов, ожидая сигнала к продолжению работы",
            "немедленно прекратит исполняться и будет переведён в фон", "немедленно запустит подпрограмму-обработчик данного сигнала, а если обработчика нет, то система сама обработает сигнал (завершит процесс)", 4
        )
        questionsList.add(que182)
        val que183 = Questions(
            183, "Какой вид доступа необходим (и достаточен), чтобы получить информацию из ярлыка объекта файловой системы?",
            R.drawable.android_question,
            "доступ на чтение к каталогу, в котором этот объект находится", "доступ на чтение и использование к каталогу, в котором этот объект находится",
            "если известно имя объекта — только доступ на использование к каталогу, в котором он находится, в противном случае — предыдущий вариант", "доступ на чтение и использование к каталогу, в котором находится объект, и доступ на чтение к самому объекту", 3
        )
        questionsList.add(que183)
        val que184 = Questions(
            184, "Команда cut предназначена для",
            R.drawable.android_question,
            "Отбрасывания конца файла", "Отбрасывания начала файла",
            "Отбрасывания конца строк, если их длина превышает заданную", "Вывода заданного фрагмента или списка полей в строках", 4
        )
        questionsList.add(que184)
        val que185 = Questions(
            185, "Какой список файлов может сгенерировать shell по шаблону ?r*[cC]",
            R.drawable.android_question,
            "bash.rc .bashrc BarC rrrc", "tric rC r.C mail.rc",
            "oroc ir/ac arc r@C", "*rcC CrooC crc or..c", 4
        )
        questionsList.add(que185)
        val que186 = Questions(
            186, "Большинство команд редактора Emacs начинаются с префиксного ключа, потому что",
            R.drawable.android_question,
            "Так их проще отличить от команд других текстовых редакторов", "Во времена создания Emacs на терминалах не было функциональных клавиш",
            "Команды Emacs должны начинаться с управляющих символов, которых намного меньше, чем команд. Значит, большинство команд будет длиннее одного символа и начинаться с одинаковых символов — префиксных ключей", "Таким образом в Emacs происходит переключение режимов", 3
        )
        questionsList.add(que186)
        val que187 = Questions(
            187, "Что означает присутствие в системе символьной ссылки /etc/rc.d/rc1.d/K75netfs на /etc/init.d/netfs?",
            R.drawable.android_question,
            "при переходе на уровень выполнения 1 должен быть запущен стартовый сценарий K75netfs без параметров", "при переходе на уровень выполнения 1 должен быть запущен стартовый сценарий netfs с параметром “stop”",
            "при переходе на уровень выполнения 75 должен быть запущен стартовый сценарий netfs с параметром “kill”", "при переходе на уровень выполнения 1 должен быть остановлен сценарий netfs", 2
        )
        questionsList.add(que187)
        val que188 = Questions(
            188, "Какова функция демона cron?",
            R.drawable.android_question,
            "выполнять действия по ежедневной профилактике системы", "автоматически выполнять действия по расписанию, когда наступает соответствующий момент",
            "автоматически выполнять действия по расписанию, а если они по какой-либо причине не были выполнены вовремя — выполнять их, как только это становится возможным", "автоматически выполнять запланированные действия в случайное время, чтобы не загружать компьютер работой", 2
        )
        questionsList.add(que188)
        val que189 = Questions(
            189, "Альтернативы пакетов применяются, когда необходимо, чтобы",
            R.drawable.android_question,
            "В системе было установлено два пакета, решающих одну и ту же задачу", "Система без помощи пользователя выбирала, какой из двух похожих пакетов следует устанавливать",
            "В системе было установлено два пакета, содержащих файлы с одинаковыми полными путями", "При установке любого или нескольких из альтернативных пакетов в системе появлялся файл с одним и тем же полным именем, но конфликтов между пакетами не возникало", 4
        )
        questionsList.add(que189)
        val que190 = Questions(
            190, "В файле /etc/services содержится",
            R.drawable.android_question,
            "список активных сетевых подключений", "список серверов DNS, которые следует использовать при подключении к Internet",
            "соответствия названий сетевых протоколов номерам постоянно закреплённых за ними портов", "соответствия IP-адресов именам компьютеров в сети", 3
        )
        questionsList.add(que190)
        val que191 = Questions(
            191, "Какой из перечисленных протоколов не имеет широкого применения в настоящее время из-за небезопасности?",
            R.drawable.android_question,
            "HTTP", "SMTP",
            "TELNET", "FTP", 3
        )
        questionsList.add(que191)
        val que192 = Questions(
            192, "KDE и GNOME",
            R.drawable.android_question,
            "Альтернативные X11 варианты графических подсистем", "Диспетчеры окон",
            "Мощные графические среды, помогающие пользователю создать «рабочий стол»", "Пакеты офисных программ (работа с текстами, электронные таблицы и т. п.)", 3
        )
        questionsList.add(que192)
        val que193 = Questions(
            193, "Что объединяет проекты Mozilla, OpenOffice.org и blender?",
            R.drawable.android_question,
            "Это WWW-броузеры", "Эти программы делает одна и та же группа разработчиков",
            "Эти программные продукты распространяются под несвободной лицензией", "Все они берут начало из проектов, которые разрабатывались под несвободной лицензией, но нынешняя лицензия — свободная", 4
        )
        questionsList.add(que193)
        val que194 = Questions(
            194, "На момент написания лекций (в 2004 году)",
            R.drawable.android_question,
            "Не было дистрибутивов Linux, разрабатываемых в России", "Существовал единственный дистрибутив Linux, разрабатываемый в России",
            "Существовало не менее двух дистрибутивов Linux, разрабатываемых в России", "Большинство дистрибутивов Linux разрабатывалось в России", 3
        )
        questionsList.add(que194)
        val que195 = Questions(
            195, "Текущий каталог",
            R.drawable.android_question,
            "Доступен пользователю на чтение, запись и использование", "Служит точкой отсчёта относительного пути",
            "Выводится на экран при выполнении команды cd", "Невозможно сменить, не обладая правами суперпользователя", 2
        )
        questionsList.add(que195)
        val que196 = Questions(
            196, "Пользователь может получить список содержащихся в каталоге dir файлов и просмотреть их содержимое, но не может создать или удалить файл в каталоге dir. Каков режим доступа к этому каталогу?",
            R.drawable.android_question,
            "доступен только на чтение", "доступен только на чтение и использование",
            "доступен только на использование", "доступен только на чтение и запись", 2
        )
        questionsList.add(que196)
        val que197 = Questions(
            197, "Большинство фильтров Linux работают с",
            R.drawable.android_question,
            "Файлами любого заранее описанного формата", "Файлами, поделёнными на строки равной длины",
            "Файлами, разбитыми на строки, каждая из которых может разделяться на поля", "Файлами, разбитыми на записи при помощи разделителей", 3
        )
        questionsList.add(que197)
        val que198 = Questions(
            198, "Какой результат выведет на терминал команда cd; echo $??",
            R.drawable.android_question,
            "0", "1",
            "название домашнего каталога", "сообщение об ошибке", 1
        )
        questionsList.add(que198)
        val que199 = Questions(
            199, "Linux — это",
            R.drawable.android_question,
            "Однопользовательская операционная система для рабочих станций", "Многопользовательская операционная система для рабочих станций",
            "Многопользовательская операционная система для сетевых серверов", "Универсальная многопользовательская операционная система, одинаково эффективно работающая как на серверах, так и на рабочих станциях", 4
        )
        questionsList.add(que199)
        val que200 = Questions(
            200, "Задача загрузчика, находящегося в ПЗУ компьютера",
            R.drawable.android_question,
            "Выбрать устройство загрузки и запустить находящийся на нём первичный загрузчик", "Предоставить пользователю интерфейс для настройки типа дискового носителя, режима работы с ним и расположения первичного загрузчика на этом носителе",
            "Выполнить всю системно-независимую часть загрузки и передать управление системному первичному загрузчику", "Разыскать все первичные загрузчики на внешних устройствах и предоставить пользователю интерфейс выбора одного из них", 1
        )
        questionsList.add(que200)
        val que201 = Questions(
            201, "Могут ли в Linux существовать устройства, доступные на запись любому пользователю?",
            R.drawable.android_question,
            "Это запрещено", "Обычно нет, но суперпользователь может вручную сменить права доступа",
            "Устройств, доступных на запись всем пользователям одновременно, не существует, однако права доступа к целой группе устройств передаются любому пользователю, зарегистрированному в системе первым", "Такие устройства существуют всегда", 4
        )
        questionsList.add(que201)
        val que202 = Questions(
            202, "При редактировании конфигурационных файлов",
            R.drawable.android_question,
            "Всегда используется текстовый редактор", "Может применяться текстовый редактор, но в некоторых случаях необходимо использовать специальные утилиты",
            "Может применяться текстовый редактор, но в некоторых случаях, для обеспечения атомарности, необходимо использовать редактор Vim", "Всегда применяются специальные утилиты (возможно, запускающие текстовый редактор из переменной окружения EDITOR)", 2
        )
        questionsList.add(que202)
        val que203 = Questions(
            203, "Зависимости пакетов возникают по причине того, что",
            R.drawable.android_question,
            "Создатель пакетов стремится использовать стандартные в рамках всего дистрибутива средства разработки, библиотеки и вспомогательные пакеты", "Создатели пакетов не договариваются заранее, как называются файлы, входящие в различные пакеты",
            "Создатель пакета стремится использовать стандартные в рамках всего дистрибутива имена для файлов и каталогов, входящих в его пакет", "Создатели пакетов не договариваются заранее, какие библиотеки и служебные пакеты разрешается использовать для сборки каждого пакета", 1
        )
        questionsList.add(que203)
        val que204 = Questions(
            204, "Какое из приведённых свойств не относится к соединениям типа «точка–точка»?",
            R.drawable.android_question,
            "Соединения могут быть установлены с использованием любой среды передачи данных", "Процедура установления соединения может сопровождаться идентификацией обеих сторон",
            "Если в соединении участвует более двух абонентов, среди них выбирается «главный» (master host)", "Сетевые интерфейсы, соответствующие сторонам такого соединения, в Linux, как правило, не нуждаются в интерфейсных адресах", 3
        )
        questionsList.add(que204)
        val que205 = Questions(
            205, "Кто может запустить графическую подсистему в Linux",
            R.drawable.android_question,
            "любой авторизованный пользователь", "только суперпользователь",
            "зависит от профиля системы", "она запускается автоматически при загрузке системы", 1
        )
        questionsList.add(que205)
        val que206 = Questions(
            206, "Работа с электронными таблицами и редактирование размеченного текста в Linux",
            R.drawable.android_question,
            "Предоставляются только пакетом OpenOffice.org", "Предоставляются только пакетами OpenOffice.org и KOffice",
            "Предоставляются пакетами OpenOffice.org и KOffice, а также различными отдельными программными продуктами", "Предоставляется только различными программными продуктами, имеющими принципиально различную структуру меню и формат документов", 3
        )
        questionsList.add(que206)
        val que207 = Questions(
            207, "Свободное программное обеспечение может распространяться под лицензиями",
            R.drawable.android_question,
            "только GPL", "GPL или BSD",
            "любой лицензией, которая передаёт пользователю права, оговорённые критериями свободного ПО", "любой лицензией, в которой оговаривается условие «copyleft»", 3
        )
        questionsList.add(que207)
        val que208 = Questions(
            208, "Терминал — это",
            R.drawable.android_question,
            "Любое устройство ввода-вывода", "Устройство ввода-вывода текстовой информации",
            "Устройство ввода-вывода текстовой информации, особым образом интерпретирующее часть передаваемых символов", "Устройство ввода-вывода текстовой информации, особым образом интерпретирующее часть передаваемых символов и оснащённое клавиатурой, монитором и мышью", 3
        )
        questionsList.add(que208)
        val que209 = Questions(
            209, "В файловой системе Linux",
            R.drawable.android_question,
            "один корневой каталог", "по одному корневому каталогу на каждый диск",
            "не более 15 корневых каталогов", "не более двух корневых каталогов", 1
        )
        questionsList.add(que209)
        val que210 = Questions(
            210, "Как связаны символьная ссылка и файл, на который она указывает?",
            R.drawable.android_question,
            "они представляют собой один и тот же файл", "символьная ссылка — другое имя того же индексного дескриптора",
            "символьная ссылка — это специальный файл, содержащий имя другого файла (на который она указывает)", "символьная ссылка указывает на область диска, где расположен файл", 3
        )
        questionsList.add(que210)
        val que211 = Questions(
            211, "Процесс однозначно определяется",
            R.drawable.android_question,
            "UID", "UID и GID",
            "PID", "PID, UID и GID", 3
        )
        questionsList.add(que211)
        val que212 = Questions(
            212, "Для того, чтобы процесс выступал в роли члена группы по отношению к файлу, необходимо, чтобы",
            R.drawable.android_question,
            "GID файла совпадал с GID процесса", "GID процесса входил в список GID, членом которых является хозяин файла",
            "GID файла входил в список GID, членом которых является хозяин процесса", "UID файла не совпадал с UID процесса, а GID файла входил в список GID, членом которых является хозяин процесса", 4
        )
        questionsList.add(que212)
        val que213 = Questions(
            213, "Файловый дескриптор — это:",
            R.drawable.android_question,
            "номер одного из трёх стандартных потоков ввода/вывода", "номер открытого для процесса файла, используемый при операциях чтения/записи",
            "номер открытого для процесса потока данных, используемый при операциях чтения/записи", "уникальный номер файла в системе", 3
        )
        questionsList.add(que213)
        val que214 = Questions(
            214, "Чтобы на стандартный ввод команды cat, запущенной без параметров и дополнительных операций shell, попал символ “^V”",
            R.drawable.android_question,
            "надо заключить строку в одинарные кавычки", "надо экранировать его с помощью “”",
            "надо нажать его дважды", "надо перенаправить стандартный ввод на файл, содержащий “^V”", 3
        )
        questionsList.add(que214)
        val que215 = Questions(
            215, "Текстовый редактор нужен, чтобы",
            R.drawable.android_question,
            "редактировать конфигурационные файлы", "редактировать любые файлы",
            "редактировать любые файлы в текстовом формате", "редактировать любые файлы в формате «plain text»", 3
        )
        questionsList.add(que215)
        val que216 = Questions(
            216, "Пользователь должен завершить сеанс работы в Linux:",
            R.drawable.android_question,
            "командой logout или нажатием клавиш Ctrl+D", "командой passwd",
            "клавишами Ctrl+Alt+Del", "кнопкой отключения питания", 1
        )
        questionsList.add(que216)
        val que217 = Questions(
            217, "Наличие в системе нескольких уровней выполнения позволяет",
            R.drawable.android_question,
            "Загружать одновременно несколько профилей системы", "Загружать систему в соответствии с одним из любого числа заранее подготовленных профилей, не редактируя для этого файлов",
            "Загружать систему в соответствии с одним из ограниченного числа профилей, внося незначительные изменения в один файл, или приводить её в соответствие этому профилю вручную без редактирования", "Уменьшать по команде количество возможностей системы (понижать уровень выполнения), однако при перезагрузке будет выбираться наибольший уровень", 3
        )
        questionsList.add(que217)
        val que218 = Questions(
            218, "Расширенный раздел — это",
            R.drawable.android_question,
            "Раздел диска особого типа, добавляемый к предыдущему разделу в таблице", "Раздел диска особого типа, в свою очередь разбиваемый на разделы",
            "Раздел диска, указанный в расширенной таблице разбиения диска, размер которой, в отличие от обычной таблицы разбиения, не ограничен", "То же, что и дополнительный раздел", 2
        )
        questionsList.add(que218)
        val que219 = Questions(
            219, "Мефодий придумал собственный способ идентификации пользователя. Как обучить Linux этому способу?",
            R.drawable.android_question,
            "Запрограммировать его в виде программы и подменить исходную программу login", "Запрограммировать его в виде модуля PAM и исправить настройки /etc/pam.d/system-auth",
            "Запрограммировать его в виде программ и заменить ими исходные программы login, passwd и su", "Запрограммировать его в виде модуля PAM и заменить этим модулем файл /etc/pam.d/system-auth", 2
        )
        questionsList.add(que219)
        val que220 = Questions(
            220, "С помощью установщика пакетов невозможно:",
            R.drawable.android_question,
            "определить неудовлетворённые зависимости пакета", "при установке пакета автоматически удалить конфликтующий пакет",
            "при удалении пакета сохранить отредактированные вручную конфигурационные файлы", "получить список файлов пакета, которые были изменены с момента установки", 2
        )
        questionsList.add(que220)
        val que221 = Questions(
            221, "Каковы обязанности метадемона inetd?",
            R.drawable.android_question,
            "Отслеживать сетевую активность на всех портах системы и запускать обработчики, которые будут принимать подключения по зарегистрированным портам и обрабатывать их", "Принимать подключение по указанному порту и запускать различные обработчики-фильтры в зависимости от протокола, указанного при подключении",
            "Отслеживать сетевую активность только на зарегистрированных портах и сообщать постоянно находящимся в памяти обработчикам-демонам о том, что необходимо принять подключение", "Принимать подключения сразу по нескольким портам и запускать указанные обработчики-фильтры", 4
        )
        questionsList.add(que221)
        val que222 = Questions(
            222, "Когда и для чего применяется «отпечаток пальца» (fingerprint) открытого ключа в асимметричной схеме шифрования?",
            R.drawable.android_question,
            "При получении открытого ключа для того, чтобы проверить, совпадает ли его отпечаток с отпечатком этого ключа, полученным по другим каналам", "При генерации пары «открытый ключ - секретный ключ», для проверки надёжности этой пары",
            "При получении открытого ключа для того, чтобы проверить совпадает ли его отпечаток с отпечатком имеющегося секретного ключа", "При каждом получении данных, зашифрованных открытым ключем для того, чтобы проверить, совпадает ли прилагающийся отпечаток секретного ключа с имеющимся у пользователя", 1
        )
        questionsList.add(que222)
        val que223 = Questions(
            223, "Какой раздел конфигурационного файла XF86Config определяет, какие из описанных в XF86Config устройств ввода и вывода будут использоваться при работе X-сервера",
            R.drawable.android_question,
            "ServerLayout", "InputDevice и Screen",
            "InputDevice и Monitor", "Screen", 1
        )
        questionsList.add(que223)
        val que224 = Questions(
            224, "Программа k3b предназначена для",
            R.drawable.android_question,
            "Записи дисков в формате CD и DVD", "Прослушивания аудио CD",
            "Просмотра DVD", "Просмотра роликов в формате DVD и MPEG, а также прослушивания музыки с аудио дисков и из файлов в формате OGG", 1
        )
        questionsList.add(que224)
        val que225 = Questions(
            225, "UNIX — это",
            R.drawable.android_question,
            "операционная система, написанная Ричардом Столлманом", "любая свободная операционная система",
            "операционная система, изначально разработанная в фирме AT&amp;T, впоследствии широко распространившаяся в разных версиях от разных производителей", "операционная система, разработанная в фирме Sun и принадлежащая этой фирме до настоящего момента", 3
        )
        questionsList.add(que225)
        val que226 = Questions(
            226, "Основная информация о системе содержится",
            R.drawable.android_question,
            "В файлах вида «README» и «HOWTO»", "В справочных подсистемах help и apropos",
            "В справочных подсистемах man и info", "В файлах вида «NAME», «SYNOPSIS», «DESCRIPTION» и «SEE ALSO»", 3
        )
        questionsList.add(que226)
        val que227 = Questions(
            227, "В какой кодировке могут быть записаны русские имена файлов в Linux:",
            R.drawable.android_question,
            "KOI8-R", "CP-1251",
            "CP-866", "в любой кодировке, подходящей для записи русских имён", 4
        )
        questionsList.add(que227)
        val que228 = Questions(
            228, "\"./\" — это:",
        R.drawable.android_question,
        "полный путь", "домашний каталог",
        "текущий каталог", "корневой каталог", 3
        )
        questionsList.add(que228)
        val que229 = Questions(
            229, "Сигналы — это",
            R.drawable.android_question,
            "механизм частичной или полной остановки процесса", "механизм передачи коротких (длиной не более килобайта) сообщений между процессами",
            "механизм передачи коротких (одно целое число) сообщений от системы или процесса другому процессу", "небольшие (как правило, один символ) фрагменты вводимых с клавиатуры данных, которые по-особому обрабатываются процессом", 3
        )
        questionsList.add(que229)
        val que230 = Questions(
            230, "Каково главное отличие суперпользователя от остальных пользователей Linux?",
            R.drawable.android_question,
            "правами суперпользователя обладает только учётная запись системного администратора", "процессы, имеющие UID суперпользователя, не подчиняются ограничениям на права доступа",
            "учётная запись суперпользователя всегда называется root", "суперпользователь обладает правом останавливать и перезагружать систему", 2
        )
        questionsList.add(que230)
        val que231 = Questions(
            231, "Что окажется записанным в файле textfile после такой операции: sort &lt; textfile &gt;&gt; textfile ?",
            R.drawable.android_question,
            "содержимое textfile (не изменится)", "отсортированное содержимое textfile, повторённое дважды",
            "содержимое textfile + отсортированное содержимое textfile", "ничего (пустой файл)", 3
        )
        questionsList.add(que231)
        val que232 = Questions(
            232, "Как, редактируя текст в Vim/Vi, найти первое после курсора выражение «встретил дважды» и заменить его на «встречал»?",
            R.drawable.android_question,
            "/встретил дваждыEnterc2wiвстречал", "/встретил дваждыEnterc2wвстречалESC",
            "s/встретил дважды/встречал", ":1,\$s/встретил дважды/встречал", 2
        )
        questionsList.add(que232)
        val que233 = Questions(
            233, "Очерёдность запуска и остановки системных служб обеспечивается",
            R.drawable.android_question,
            "Конфигурационным файлом, находящимся в каталоге /etc/rc.d", "Именованием по строгим правилам файлов в каталоге /etc/rc.d/init.d",
            "Специальными настройками, вписанными внутрь стартовых сценариев", "Именованием по строгим правилам файлов в каталогах /etc/rc.d/rc*.d", 4
        )
        questionsList.add(que233)
        val que234 = Questions(
            234, "Виртуальная файловая система — это",
            R.drawable.android_question,
            "Файловая система, содержимое которой уничтожается при размонтировании", "Представление в виде дерева каталогов информации, находящейся в оперативной памяти",
            "Файловая система, содержимое которой не существует до тех пор, пока к ней не обратятся", "Представление в виде дерева каталогов любых иерархически организованных данных", 4
        )
        questionsList.add(que234)
        val que235 = Questions(
            235, "Каким способом должно происходить в Linux «прокручивание» без сжатия воображаемого системного журнала с именем log и длиною очереди 5?",
            R.drawable.android_question,
            "Файл log переименовывается в log.1, log.1 — в log.2 и т. д.; файл log.5 удаляется, и заводится новый log", "Файл log.4 переименовывается в log.5, log.3 — в log.4 и т.д.; файл log переименовывается в log.1 и заводится новый log",
            "Первые (самые старые) 5 записей файла log удаляются", "Из файла log удаляются все записи, за исключением последних 5 (самых новых)", 2
        )
        questionsList.add(que235)
        val que236 = Questions(
            236, "Репозиторий пакетов — это",
            R.drawable.android_question,
            "любой набор пакетов", "набор пакетов в одном формате, размещённых в одном каталоге",
            "организованное по специальным правилам хранилище пакетов, используемое менеджерами пакетов в качестве источника", "любой комплект пакетов на CD или DVD", 3
        )
        questionsList.add(que236)
        val que237 = Questions(
            237, "Команда ifconfig выдаёт",
            R.drawable.android_question,
            "Список ethernet-карт компьютера и их настроек", "Список IP-адресов компьютера и связанную с ними информацию",
            "Список сетевых интерфейсов системы", "Список MAC-адресов, однозначно идентифицирующих сетевые интерфейсы системы и связанную с ними информацию", 3
        )
        questionsList.add(que237)
        val que238 = Questions(
            238, "Протокол FTP отличается от протокола HTTP тем, что",
            R.drawable.android_question,
            "HTTP предназначен для передачи гипертекстов любой вложенности, а FTP — для передачи только файлов", "Для передачи одного файла в HTTP необходимо одно TCP-соединение, а в FTP — два",
            "По HTTP можно передавать только текстовые и гипертекстовые файлы, архивы и файлы изображений, а по протоколу FTP — файлы любого типа", "Протокол HTTP предоставляет возможность передачи динамически генерируемого содержимого (CGI), а протокол FTP — нет", 2
        )
        questionsList.add(que238)
        val que239 = Questions(
            239, "Чтобы X-приложение успешно запустилось из командной строки, необходимо",
            R.drawable.android_question,
            "иметь запущенный X-сервер на той же машине", "иметь запущенный X-сервер, адрес которого определён в переменной окружения DISPLAY данного командного интерпретатора или в файле ~/.Xauthority",
            "чтобы в данном командном интерпретаторе была определена переменная DISPLAY, а в домашнем каталоге пользователя — файл .Xauthority", "передать приложению адрес X-сервера и ключ доступа к нему (например, с помощью переменной DISPLAY и файла .Xauthority)", 4
        )
        questionsList.add(que239)
        val que240 = Questions(
            240, "Исправьте утверждение: «Броузер Mozilla — часть Linux»",
            R.drawable.android_question,
            "Почтовый клиент Mozilla — часть Linux", "Броузер Mozilla — часть единственного дистрибутива Linux, выпускаемого разработчиками Mozilla",
            "Броузер Mozilla входит во многие дистрибутивы Linux", "Утверждение верно", 3
        )
        questionsList.add(que240)
        val que241 = Questions(
            241, "Первым широко распространённым некоммерческим дистрибутивом Linux стал",
            R.drawable.android_question,
            "RedHat", "Debian",
            "Gentoo", "Slackware", 4
        )
        questionsList.add(que241)
        val que242 = Questions(
            242, "Запуском исполняемых программ в Linux занимается",
            R.drawable.android_question,
            "Сам пользователь, при помощи терминала", "Программа-загрузчик, вследствие команды от shell или системы",
            "Система, под воздействием управляющих символов", "Интерпретатор командной строки, на основе разбора команды пользователя", 4
        )
        questionsList.add(que242)

        return questionsList
    }

    fun getQuestionsJava(): ArrayList<Questions> {
        val questionsList = ArrayList<Questions>()
        val que1 = Questions(
            1, "По типу результата все методы можно разделить на:",
            R.drawable.android_question,
            "Статические и не статические", "Константы и переменные",
            "С возвращаемым значением и без", "Целочисленные и дробные", 3
        )
        questionsList.add(que1)
        val que2 = Questions(
            2, "Какой класс является суперклассом для всех классов:",
            R.drawable.android_question,
            "Main", "MainClass",
            "Object", "Super", 3
        )
        questionsList.add(que2)
        val que3 = Questions(
            3, "В какой кодировке хранятся символы в переменной типа char:",
            R.drawable.android_question,
            "UTF-32", "UTF-16",
            "UTF-8", "ASCII", 2
        )
        questionsList.add(que3)
        val que4 = Questions(
            4, "Результат сравнения - это:",
            R.drawable.android_question,
            "Объект", "Число",
            "Символ", "Логическое значение", 4
        )
        questionsList.add(que4)
        val que5 = Questions(
            5, "Какой из способов объявления массива некорректен:",
            R.drawable.android_question,
            "int a[][] = new int[5][5];", "int[][] a = new int[5][5];",
            "[]int[] a = new int[5][5];", "int[] a[] = new int[5][5];", 3
        )
        questionsList.add(que5)
        val que6 = Questions(
            6, "Укажите правильную форму метода main:",
            R.drawable.android_question,
            "public static void main(String[] args)", "public void main(String[] args)",
            "public static void main()", "public static void Main(String[] args)", 1
        )
        questionsList.add(que6)
        val que7 = Questions(
            7, "Как узнать количество элементов в массиве?",
            R.drawable.android_question,
            "arrayName.size()", "size(arrayName)",
            "arrayName.length()", "arrayName.length", 3
        )
        questionsList.add(que7)
        val que8 = Questions(
            8, "Какой цикл имеет инициализатор, условие и шаг?",
            R.drawable.android_question,
            "for", "infinite loop",
            "do-while", "for-earch", 1
        )
        questionsList.add(que8)
        val que9 = Questions(
            9, "Для объявления переменной в Java достаточно задать:",
            R.drawable.android_question,
            "Тип, имя, первоначальное значение", "Тип, имя",
            "Тип, первоначальное значение", "Имя", 2
        )
        questionsList.add(que9)
        val que10 = Questions(
            10, "Для массивов в Java верно:",
            R.drawable.android_question,
            "Изменяемый состав элементов разных типов", "Фиксированное количество элементов разных типов",
            "Фиксированное количество элементов одного типа", "Изменяемый состав элементов одного типа", 3
        )
        questionsList.add(que10)
        val que11 = Questions(
            11, "Какие категории типов данных поддерживаются в Java:",
            R.drawable.android_question,
            "Переменные, примитивные", "Ссылочные (объектные)",
            "Примитивные", "Примитивные, ссылочные (объектные)", 4
        )
        questionsList.add(que11)
        val que12 = Questions(
            12, "Вызвать не статический метод или свойство из другого класса можно:",
            R.drawable.android_question,
            "Только создав экземпляр класса, в котором они реализованы", "Не создавая экземпляр класса, в котором они реализованы",
            "Только из зависимых классов", "Из любого класса в том же пакете", 1
        )
        questionsList.add(que12)
        val que13 = Questions(
            13, "Размер переменной типа char равен:",
            R.drawable.android_question,
            "16 бит", "32 бита",
            "8 бит", "64 бита", 1
        )
        questionsList.add(que13)
        val que14 = Questions(
            14, "Если в сигнатуре метода указано void, то ключевое слово return в теле метода:",
            R.drawable.android_question,
            "Не обязательно, может быть указано с любым значением", "Не обязательно, но может быть указано в качестве прерывания работы метода",
            "Обязательно, но без какого-либо значения", "Обязательно как минимум один раз с любым значением", 2
        )
        questionsList.add(que14)
        val que15 = Questions(
            15, "Какая запись операторов сравнения верна?",
            R.drawable.android_question,
            "<, >, <=, >=, =, !", "<, >, <=, >=, ===, !==",
            "<, >, =<, =>, =, !", "<, >, <=, >=, ==, !=", 4
        )
        questionsList.add(que15)
        val que16 = Questions(
            16, "Что является условием для выполнения итерации в цикле? ",
            R.drawable.android_question,
            "Арифметическое выражение, результат которого - любое неотрицательное число .", "Логическое выражение, результат которого - истина ",
            "Логическое выражение, результат которого значения не имеет", "Логическое выражение, результат которого - ложь", 2
        )
        questionsList.add(que16)
        val que17 = Questions(
            17, "Какой оператор нужен в выражении 5...5, чтобы оно стало истинным?",
            R.drawable.android_question,
            "!=", "=",
            "<", "<=", 4
        )
        questionsList.add(que17)
        val que18 = Questions(
            18, "По типу результата все методы можно разделить на:",
            R.drawable.android_question,
            "С аргументами и без", "Константы и переменные",
            "С возвращением и без", "Статические и не статические", 3
        )
        questionsList.add(que18)
        val que19 = Questions(
            19, "Экземплят класса String напрямую нельзя создать из:",
            R.drawable.android_question,
            "Массива символов", "Строкового литерала",
            "Экземпляра класса StringBuffer", "Массива строк", 4
        )
        questionsList.add(que19)
        val que20 = Questions(
            20, "Тернарным логическим оператором является:",
            R.drawable.android_question,
            "^", "&&",
            "? :", "||", 3
        )
        questionsList.add(que20)
        val que21 = Questions(
            21, "В классе-наследнике определен статический метод такой же как в родительском.",
            R.drawable.android_question,
            "Метод в классе-наследнике скроет (hiding) родительский метод", "Метод в супер-классе скроет (hiding) метод в классе-наследнике",
            "Метод в классе-наследнике переопределит (override) родительский метод", "Метод в классе-наследнике перегрузит (overload) родительский метод", 1
        )
        questionsList.add(que21)
        val que22 = Questions(
            22, "Укажите правильную форму метода main:",
            R.drawable.android_question,
            "public static void main()", "public static void main(String[] args)",
            "public void main(String[] args)", "public int main(String[] args)", 2
        )
        questionsList.add(que22)
        val que23 = Questions(
            23, "Как узнать количество элементов в массиве?",
            R.drawable.android_question,
            "arrayName.length()", "arrayName.length",
            "arryaName.size()", "size(arrayName)", 2
        )
        questionsList.add(que23)
        val que24 = Questions(
            24, "К какому принципу ООП относятся понятие иерархии классов и зарезервированное слово extends?",
            R.drawable.android_question,
            "Инкапсуляция", "Абстракция",
            "Наследование", "Реализация", 3
        )
        questionsList.add(que24)
        val que25 = Questions(
            25, "Для массивов в Jаvа верно:",
            R.drawable.android_question,
            "Изменяемый состав элементов одного типа", "Фиксированное количество элементов одного типа",
            "Фиксированное количество элементов разных типов", "Изменяемый состав элеменов разных типов", 2
        )
        questionsList.add(que25)
        val que26 = Questions(
            26, "Метод в Java может содержать как минимум:",
            R.drawable.android_question,
            "Имя, тело метода", "Имя, список аргументов, тело метода",
            "Тип результата, имя, список аргументов", "Тип результата, имя, список аргументов, тело метода", 4
        )
        questionsList.add(que26)
        val que27 = Questions(
            27, "Какой из способов объявления массива некорректен:",
            R.drawable.android_question,
            "int[] a[] = new int[5][5];", "[]int[] a = new int[5][5];",
            "int a[][] = new int[5][5];", "int[][] a = new int[5][5];", 2
        )
        questionsList.add(que27)
        val que28 = Questions(
            28, "Если в сигнатуре метода указано void, то ключевое слово return в теле метода:",
            R.drawable.android_question,
            "Не обязательно, но может быть указано в качестве прерывания работы метода", "Не обязательно, может быть указано с любым значением",
            "Обязательно, но без какого-либо значения", "Обязательно как минимум один раз с любым значением", 1
        )
        questionsList.add(que28)
        val que29 = Questions(
            29, "Для массивов в Java верно:",
            R.drawable.android_question,
            "Фиксированное количество элементов разных типов", "Изменяемый состав элементов разных типов",
            "Фиксированное количество элементов одного типа", "Изменяемый состав элементов одного типа", 3
        )
        questionsList.add(que29)
        val que30 = Questions(
            30, "Аргумент метода - это:",
            R.drawable.android_question,
            "Значение или переменная, передаваемая в метод для участия в его работе", "Переменная, в которую записывается результат работы метода",
            "Значение, указываемое после ключевого словаа return", "Переменная, объявленная в теле метода", 1
        )
        questionsList.add(que30)
        val que31 = Questions(
            31, "Вызвать статический метод или свойство можно:",
            R.drawable.android_question,
            "Только создав экземпляр класса, в котором они реализованы", "Из любого класса в том же пакете",
            "Не создавая экземпляр класса, в котором они реализованы", "Из любого метода в этом же классе", 3
        )
        questionsList.add(que31)
        val que32 = Questions(
            32, "Укажите правильную форму метода main:",
            R.drawable.android_question,
            "public static void main(String[] args)", "public static void main()",
            "public int main(String[] args)", "public void main(String[] args)", 1
        )
        questionsList.add(que32)
        val que33 = Questions(
            33, "Размер переменной типа short равен:",
            R.drawable.android_question,
            "16 бит", "8 бит",
            "32 бита", "64 бита", 1
        )
        questionsList.add(que33)
        val que34 = Questions(
            34, "К какому принципу ООП относятся понятия иерархия классов и зарезервированное слово extends?",
            R.drawable.android_question,
            "Наследование", "Инкапсуляция",
            "Реализация", "Абстракция", 1
        )
        questionsList.add(que34)
        val que35 = Questions(
            35, "Что является условием для выполнения итерации в цикле? ",
            R.drawable.android_question,
            "Логическое выражение, результат которого - ложь", "Логическое выражение, результат которого значения не имеет",
            "Арифметическое выражение, результат которого - любое неотрицательное число .", "Логическое выражение, результат которого - истина ", 4
        )
        questionsList.add(que35)
        val que36 = Questions(
            36, "Какой из способов объявления массива некорректен:",
            R.drawable.android_question,
            "int d[][] = new int[4][5];", "int e[5] = {1,2,3,4,5};",
            "int a[] = new int[5];", "int c[][] = {{1,2},{3,4}};", 2
        )
        questionsList.add(que36)
        val que37 = Questions(
            37, "Экземпляр класса String нельзя напрямую создать из:",
            R.drawable.android_question,
            "Экзепляра класса StringBuffer;", "Массива строк",
            "Строкового литерала", "Массива символов", 2
        )
        questionsList.add(que37)
        val que38 = Questions(
            38, "Тернарным опреатором является:",
            R.drawable.android_question,
            "||", "^",
            "!", "?:", 4
        )
        questionsList.add(que38)
        val que39 = Questions(
            39, "Какой способ в общем случае сравнит два объекта по значению?",
            R.drawable.android_question,
            "equals (obj1 == obj2);", "obj1 = obj2;",
            "obj1 == obj2;", "obj1.equals(obj2);", 4
        )
        questionsList.add(que39)
        val que40 = Questions(
            40, "Что такое значение переменной?",
            R.drawable.android_question,
            "Адрес в памяти, по которому хранится значение переменной", "Типы данных, доступные для хранения в переменных",
            "Данные, хранящиеся в переменной", "Участок в памяти, где хранятся данные", 3
        )
        questionsList.add(que40)
        val que41 = Questions(
            41, "Какой цикл имеет инициализатор, условие и шаг?",
            R.drawable.android_question,
            "for-earch", "for",
            "infinite loop", "do-while", 2
        )
        questionsList.add(que41)
        val que42 = Questions(
            42, "Как Java CodeConvention рекомендует называть классы и методы?",
            R.drawable.android_question,
            "Классы пишутся строчными буквами, методы целиком заглавными", "Классы начинаются с заглавной буквы, методы c заглавной",
            "Классы начинаются с заглавной буквы, методы со строчной", "Классы пишутся заглавными буквами, методы целиком строчными", 3
        )
        questionsList.add(que42)
        val que43 = Questions(
            43, "Укажите пакет, в котором классы String, StringBuffer, StringBuilder",
            R.drawable.android_question,
            "java.lang, не требует обязательного импорта", "java.text, требует обязательного импорта",
            "java.lang, требует обязательного импорта", "java.util, требует обязательного импорта", 1
        )
        questionsList.add(que43)
        val que44 = Questions(
            44, "К какому приннципу ООП относится понятия иерарзии классов и зарезервированное слова extends?",
            R.drawable.android_question,
            "Наследование", "Реализация",
            "Инкапсуляция", "Абстракция", 1
        )
        questionsList.add(que44)
        val que45 = Questions(
            45, "Инициализированная переменная в Java имеет:",
            R.drawable.android_question,
            "Имя, первоначальное значение", "Тип, имя, первоначальное значение",
            "Тип, имя", "Тип, первоначальное значение", 2
        )
        questionsList.add(que45)
        val que46 = Questions(
            46, "Как Java CodeConvention рекомендует называть классы и методы?",
            R.drawable.android_question,
            "Классы начинаются со строчной буквы, методы с заглавной", "Классы начинаются с заглавной буквы, методы со строчной",
            "Классы пишутся заглавными буквами, методы целиком строчными", "Классы пишутся строчными буквами, методы целиком заглавными", 2
        )
        questionsList.add(que46)
        val que47 = Questions(
            47, "Результат сравнения - это:",
            R.drawable.android_question,
            "Логическое значение", "Символ",
            "Число", "Объект", 1
        )
        questionsList.add(que47)
        val que48 = Questions(
            48, "Какой вариант объявления массива некорректен:",
            R.drawable.android_question,
            "int c[][] = {{1, 2}, {3, 4}};", "int b[][] = new int [5][];",
            "int[] a = new int[5];", "int e[5] = {1, 2, 3, 4, 5}", 4
        )
        questionsList.add(que48)
        val que49 = Questions(
            49, "К какому принципу ООП относится понятия прав доступа и модификаторы public, protected, package-private и private?",
            R.drawable.android_question,
            "Наследование", "Реализация",
            "Полиморфизм", "Инкапсуляция", 4
        )
        questionsList.add(que49)
        val que50 = Questions(
            50, "Какой способ в общем случае сравнить два объекта по значению?",
            R.drawable.android_question,
            "obj1.equals(obj2);", "obj1 = obj2;",
            "obj1 == obj2;", "equals(obj1 == obj2);", 1
        )
        questionsList.add(que50)
        val que51 = Questions(
            51, "Операторы сравнения применимы для:",
            R.drawable.android_question,
            "Строк", "Функций",
            "Чисел", "Объектов", 3
        )
        questionsList.add(que51)
        val que52 = Questions(
            52, "Какие виды циклов существуют в Java?",
            R.drawable.android_question,
            "for, for-each, while, do-while", "for-each, while",
            "for, for-each, while", "for, while", 1
        )
        questionsList.add(que52)
        val que53 = Questions(
            53, "Какая запись операторов сравнения верна?",
            R.drawable.android_question,
            "<, >, =<, =>, ==, !=", "<, >, <=, >=, ==, !=",
            "<, >, =<, =>, =, !", "<, >, <=, >=, =, !", 2
        )
        questionsList.add(que53)
        val que54 = Questions(
            54, "С каким расширением хранится исходный код классов, а с каким скомпилированный?",
            R.drawable.android_question,
            "Исходный код в .javac, скомпилированный в .class", "Исходный код в .java, скомпилированный в .class",
            "Исходный код в .class, скомпилированный в .java", "Исходный код в .javac, скомпилированный в .java", 2
        )
        questionsList.add(que54)
        val que55 = Questions(
            55, "Укажите способ создания именованного экземпляра класса:",
            R.drawable.android_question,
            "new Object();", "Object();",
            "Object obj = new Object();", "Object;", 3
        )
        questionsList.add(que55)
        val que56 = Questions(
            56, "Возможно ли получить доступ к отдельным символам или диапазону символов строки?",
            R.drawable.android_question,
            "Да, символьные индексы начинаются с 'a'", "Да, числовые индексы начинаются с 0",
            "Да, символьные индексы начинаются с 'A'", "Да, числовые индексы начинаются с 1", 2
        )
        questionsList.add(que56)
        val que57 = Questions(
            57, "Для массивов в Java верно:",
            R.drawable.android_question,
            "Изменяемый состав элементов разных типов", "Изменяемый состав элементов одного типа",
            "Фиксированое количество элементов разных типов", "Фиксированое количество элементов одного типа", 4
        )
        questionsList.add(que57)
        val que58 = Questions(
            58, "Для объявления переменной в Java достаточно задать:",
            R.drawable.android_question,
            "Тип, имя", "Тип, имя, первоначальное значение",
            "Тип, первоначальное значение", "Имя, первоначальное значение", 1
        )
        questionsList.add(que58)
        val que59 = Questions(
            59, "Какой цикл имеет инициализатор, условие и шаг?",
            R.drawable.android_question,
            "Infinite loop", "do-while",
            "for", "while", 3
        )
        questionsList.add(que59)
        val que60 = Questions(
            60, "Что такое значение переменной?",
            R.drawable.android_question,
            "Операции, доступные для действий с переменной", "Участок в памяти, где хранятся данные",
            "Данные, хранящиеся в переменной", "Типы данных, доступные для хранения в переменной", 3
        )
        questionsList.add(que60)
        val que61 = Questions(
            61, "Результат сравнения - это:",
            R.drawable.android_question,
            "Объект", "Логическое значение",
            "Строка", "Число", 2
        )
        questionsList.add(que61)
        val que62 = Questions(
            62, "Если метод имеет тип boolean, какой вариант оператора return приведет к ошибке:",
            R.drawable.android_question,
            "return (boolean)0;", "return Integer.valueOf(\"10\") < 15;",
            "return true && !false;", "return 'a' > 70;", 1
        )
        questionsList.add(que62)
        val que63 = Questions(
            63, "Операторы сравнения <, >, <=, >= применимы для: ",
            R.drawable.android_question,
            "Строк", "Функций",
            "Чисел", "Объектов", 3
        )
        questionsList.add(que63)
        val que64 = Questions(
            64, "Какой из типов данных является ссылочным (объектным)?",
            R.drawable.android_question,
            "long", "String",
            "boolean", "double", 2
        )
        questionsList.add(que64)
        val que65 = Questions(
            65, "Какие виды циклов существуют в Java?",
            R.drawable.android_question,
            "for, for-each, while, do-while", "for-each, while",
            "for-each, do-while", "for, while", 1
        )
        questionsList.add(que65)
        val que66 = Questions(
            66, "Сколько измерений будет у массива ... arr = {{{1,2},{3,4}},{{5,6},{7,8}}};",
            R.drawable.android_question,
            "2", "4",
            "3", "1", 3
        )
        questionsList.add(que66)
        val que67 = Questions(
            67, "Какие категории типов данных поддерживаются в Java? ",
            R.drawable.android_question,
            "Примитивные", "Переменные, примитивные",
            "Ссылочные (объектные)", "Примитивные, ссылочные (объектные)", 4
        )
        questionsList.add(que67)
        val que68 = Questions(
            68, "Какие типы данных не могут быть в качестве условия switch-case:",
            R.drawable.android_question,
            "Дробные числа", "Строки",
            "Символы", "Целые числа", 1
        )
        questionsList.add(que68)
        val que69 = Questions(
            69, "Инициализированная переменная в Java имеет:",
            R.drawable.android_question,
            "Тип, первоначальное значение", "Имя",
            "Тип, имя, первоначальное значение", "Тип, имя", 3
        )
        questionsList.add(que69)
        val que70 = Questions(
            70, "Какой оператор нужен в выражении 5...5, чтобы оно стало истиным?",
            R.drawable.android_question,
            ">", "<",
            "<=", "!=", 3
        )
        questionsList.add(que70)
        val que71 = Questions(
            71, "Чем инициализируется по умолчанию локальная переменная ссылочного типа данных:",
            R.drawable.android_question,
            "Объектом, созданным с помощью конструктора по умолчанию", "Локальная переменные не инициализируются по умолчанию",
            "Null", "Зависит от конкретного типа переменной", 2
        )
        questionsList.add(que71)
        val que72 = Questions(
            72, "Список типов, переменных которые могут хранить дробные числа:",
            R.drawable.android_question,
            "float, double", "byte, short, int, long, float, double",
            "char, byte, short, int, long", "byte, short, int, long", 1
        )
        questionsList.add(que72)
        val que73 = Questions(
            73, "Тернарным логическим оператором является:",
            R.drawable.android_question,
            "^", "||",
            "? :", "!", 3
        )
        questionsList.add(que73)
        val que74 = Questions(
            74, "Как узнать количество элементов в массиве: int[] arr = new int[10]? ",
            R.drawable.android_question,
            "arr.length", "size(arr)",
            "arr.size()", "length(arr)", 1
        )
        questionsList.add(que74)
        val que75 = Questions(
            75, "Какой вариант объявления массива некорректен:",
            R.drawable.android_question,
            "int c[][] = {{1, 2}, {3, 4}};", "int e[5] = {1, 2, 3, 4, 5}",
            "int b[][] = new int [5][];", "int[] a = new int[5];", 2
        )
        questionsList.add(que75)
        val que76 = Questions(
            76, "Для массива в Java верно:",
            R.drawable.android_question,
            "Изменяемый состав элементов одного типа", "Изменяемый состав элементов разных типов",
            "Фиксированное количество элементов разных типов", "Фиксированное количество элементов одного типа", 4
        )
        questionsList.add(que76)
        val que77 = Questions(
            77, "Назовите две группы исключений в Java.",
            R.drawable.android_question,
            "Exception и Error", "Checked и Unchecked",
            "Catched и Uncatched", "Handle и Unhandled", 2
        )
        questionsList.add(que77)
        val que78 = Questions(
            78, "Какой метод отсутствует в классе Object?",
            R.drawable.android_question,
            "toString()", "system()",
            "clone()", "finalize()", 2
        )
        questionsList.add(que78)
        val que79 = Questions(
            79, "Какой из методов не может привести к приостановке потока?",
            R.drawable.android_question,
            "wait()", "notify()",
            "join()", "sleep()", 2
        )
        questionsList.add(que79)
        val que80 = Questions(
            80, "Поля, объявленные в интерфейсах, по умолчанию имеют модификаторы:",
            R.drawable.android_question,
            "public static final", "private static final",
            "public static", "static final", 1
        )
        questionsList.add(que80)
        val que81 = Questions(
            81, "Метод Thread.sleep()",
            R.drawable.android_question,
            "приостанавливает выполнение потока main", "приостанавливает работу программы",
            "приостанавливает работу потока, в котором был вызван без освобождения монитора", "приостанавливает работу потока, в котором был вызван с освобождением монитора", 3
        )
        questionsList.add(que81)
        val que82 = Questions(
            82, "Выберите верное утверждение",
            R.drawable.android_question,
            "если два объекта равны через equals() их hashCode() должен совпадать, если объекты не равны, их hashCode() может совпадать", "если два объекта равны через equals() их hashCode() может не совпадать",
            "если два объекта равны через equals() их hashCode() может совпадать", "если два объекта равны через equals() их hashCode() должен совпадать, если объекты не равны, их hashCode() может не совпадать", 1
        )
        questionsList.add(que82)
        val que83 = Questions(
            83, "Для создания класса checked исключения необходимо",
            R.drawable.android_question,
            "унаследовать его только от класса Exception", "указать ключевое слово checked в объвлении класса",
            "унаследовать его от класса checked исключения", "унаследовать его от класса RuntimeException", 3
        )
        questionsList.add(que83)
        val que84 = Questions(
            84, "Какой пакет импортирован по умолчанию?",
            R.drawable.android_question,
            "java.text", "java.lang",
            "java.core", "java.util", 2
        )
        questionsList.add(que84)
        val que85 = Questions(
            85, "В каком классе или интерфейсе определены методы wait(), notify() и notifyAll()?",
            R.drawable.android_question,
            "Object", "Thread",
            "Runnable", "Class", 1
        )
        questionsList.add(que85)
        val que86 = Questions(
            86, "За что отвечает метод ensureCapacity(int n) в классе ArrayList?",
            R.drawable.android_question,
            "увеличивает емкость коллекции на n элементов", "увеличивает емкость до n, если она меньше n",
            "уменьшает емкость коллекции до n, если она больше n", "возвращает true если емкость коллекции больше n", 2
        )
        questionsList.add(que86)
        val que87 = Questions(
            87, "Выберите неверное утверждение относительно ключевого слова static",
            R.drawable.android_question,
            "статические методы могут работать только со статическими полями", "статические поля общие для всех объектов класса",
            "имеется возможность переопределить(override) статические методы", "к статическому полю можно получить доступ через имя класса", 3
        )
        questionsList.add(que87)
        val que88 = Questions(
            88, "Выберите верное утверждение",
            R.drawable.android_question,
            "у перечислений может быть конструктор с параметрами, и любым модификатором доступа", "у перечислений может быть конструктор с параметрами, и только с модификатором доступа private",
            "у перечислений не может быть конструктора", "у перечислений имеется только конструктор по-умолчанию", 2
        )
        questionsList.add(que88)
        val que89 = Questions(
            89, "Какое ключевое слово используется для генерирования и выброса исключений?",
            R.drawable.android_question,
            "throws", "cast",
            "throw", "exception", 3
        )
        questionsList.add(que89)
        val que90 = Questions(
            90, "Выберите верное утверждение",
            R.drawable.android_question,
            "все утверждения верны", "HashMap допускает в качестве ключа использовать null, Hashtable - не позволяет",
            "и Hashtable, и HashMap не синхронизированы", "и Hashtable, и HashMap синхронизированы", 2
        )
        questionsList.add(que90)
        val que91 = Questions(
            91, "Утверждения:(1) Интерфейсы могут быть унаследованы от других интерфейсов (2) Перечисления могут быть унаследованы от других перечислений",
            R.drawable.android_question,
            "оба утверждения верны", "оба утверждения неверны",
            "(1) - не верно, (2) - верно", "(1) - верно, (2) - не верно", 1
        )
        questionsList.add(que91)
        val que92 = Questions(
            92, "Выберите верное утверждение:",
            R.drawable.android_question,
            "все утверждения верны", "HashMap допускает в качестве ключа использовать null, Hashtable - не позволяет",
            "и Hashtable, и HashMap не синхронизированы", "и Hashtable, и HashMap синхронизированы", 2
        )
        questionsList.add(que92)
        val que93 = Questions(
            93, "Параметр loadFactory у отображения HashMap по-умолчанию равен:",
            R.drawable.android_question,
            "0.8", "0.75",
            "1.0", "0.5", 2
        )
        questionsList.add(que93)
        val que94 = Questions(
            94, "Какой метод нужно выполнить у класса Thread для запуска нового потока?",
            R.drawable.android_question,
            "submit()", "run()",
            "execute()", "start()", 4
        )
        questionsList.add(que94)
        val que95 = Questions(
            95, "Объекты какого класса являются иммутабельными?",
            R.drawable.android_question,
            "StringBuffer", "StringBuilder",
            "ни один из вариантов", "String", 4
        )
        questionsList.add(que95)
        val que96 = Questions(
            96, "Какой пакет импортирован по умолчанию?",
            R.drawable.android_question,
            "java.text", "java.lang",
            "java.core", "java.util", 2
        )
        questionsList.add(que96)
        val que97 = Questions(
            97, "За что отвечает метод ensureCapacity(int n) в классе ArrayList?",
            R.drawable.android_question,
            "возвращает true если емкость коллекции больше n", "уменьшает емкость коллекции до n, если она больше n",
            "увеличивает емкость коллекции на n элементов", "увеличивает емкость коллекции до n, если она меньше n", 4
        )
        questionsList.add(que97)
        val que98 = Questions(
            98, "Выберите верное утверждение:",
            R.drawable.android_question,
            "если два объекта равны через equals() их hashCode() должен совпадать, если объекты не равны, их hashCode() может совпадать", "если два объекта равны через equals() их hashCode() может не совпадать",
            "если два объекта равны через equals() их hashCode() может совпадать", "если два объекта равны через equals() их hashCode() должен совпадать, если объекты не равны, их hashCode() может не совпадать", 1
        )
        questionsList.add(que98)
        val que99 = Questions(
            99, "Какое ключевое слово используется для генерирования и выброса исключений?",
            R.drawable.android_question,
            "cast", "throw",
            "throws", "exception", 2
        )
        questionsList.add(que99)
        val que100 = Questions(
            100, "Подклассом класса IOException является:",
            R.drawable.android_question,
            "Exception", "NullPointerException",
            "RuntimeException", "FileNotFoundException", 4
        )
        questionsList.add(que100)
        val que101 = Questions(
            101, "Какой из вариантов создания объекта недопустим?",
            R.drawable.android_question,
            "NavigableMap<String, Integer> map = new TreeMap<>();", "Map<String, Integer> map = new HashMap<>();",
            "HashMap<String, Integer> map = new LinkedHashMap<>();", "Collection<String, Integer> map = new HashMap<>();", 4
        )
        questionsList.add(que101)
        val que102 = Questions(
            102, "Выберите верное утверждение",
            R.drawable.android_question,
            "ArrayList и Vector синхронизированы", "ArrayList - не синхронизирован, Vector - синхронизирован",
            "ArrayList и Vector не синхронизированы", "ArrayList - синхронизирован, Vector - не синхронизирован", 2
        )
        questionsList.add(que102)
        val que103 = Questions(
            103, "Какие модификаторы доступа можно использовать для внешнего класса?",
            R.drawable.android_question,
            "public, default", "default, protected, public",
            "public, private", "public, protected", 3
        )
        questionsList.add(que103)
        val que104 = Questions(
            104, "Оператор join() предназначен для",
            R.drawable.android_question,
            "объединения нескольких потоков в один", "объединения нескольких потоков для их одновременной работы",
            "перевода одного потока в режим ожидания завершения другого потока", "обмена данными между потоками", 3
        )
        questionsList.add(que104)
        val que105 = Questions(
            105, "Какой из вариантов создания объекта недопустим?",
            R.drawable.android_question,
            "Map<String, Integer> map = new HashMap<>();", "HashMap<String, Integer> map = new LinkedHashMap<>();",
            "Collection<String, Integer> map = new HashMap<>();", "NavigableMap<String, Integer> map = new TreeMap<>();", 3
        )
        questionsList.add(que105)
        val que106 = Questions(
            106, "Какой из методов не может привести к приостановке потока?",
            R.drawable.android_question,
            "notify()", "wait()",
            "join()", "sleep()", 1
        )
        questionsList.add(que106)
        val que107 = Questions(
            107, "Объекты какого класса являются иммунабельными?",
            R.drawable.android_question,
            "StringBulder", "StringBuffer",
            "ни один из вариантов", "String", 4
        )
        questionsList.add(que107)
        val que108 = Questions(
            108, "Подклассом класса RuntimeException является",
            R.drawable.android_question,
            "IOException", "Exception",
            "FileNotFoundException", "NullPointerException", 4
        )
        questionsList.add(que108)
        val que109 = Questions(
            109, "Выберите неверное утверждение",
            R.drawable.android_question,
            "все утверждения верны", "List, Map, Set являются абстрактными классами",
            "List, Map, Set являются интерфейсами", "Классы коллекций находятся в пакете java.util", 2
        )
        questionsList.add(que109)
        val que110 = Questions(
            110, "Выберите верное утверждение",
            R.drawable.android_question,
            "ArrayList и Vector синхронизированы", "ArrayList - не синхронизирован, Vector - синхронизирован",
            "ArrayList - синхронизирован, Vector - не синхронизирован ", "ArrayList и Vector не синхронизированы ", 2
        )
        questionsList.add(que110)
        val que111 = Questions(
            111, "При создании объекта типа ArrayList в конструктор в качестве параметра нельзя передать",
            R.drawable.android_question,
            "массив элементов", "объект типа List",
            "объект типа Collection", "int", 4
        )
        questionsList.add(que111)
        val que112 = Questions(
            112, "Выберите верное утверждение",
            R.drawable.android_question,
            "если два объекта равны через equals() их hashCode() должен совпадать, если объекты не равны, их hashCode() может совпадать", "если два объекта равны через equals() их hashCode() должен совпадать, если объекты не равны, их hashCode() не должен совпадать",
            "если два объекта равны через equals() их hashCode() может не совпадать", "если два объекта равны через equals() их hashCode() может совпадать", 1
        )
        questionsList.add(que112)
        val que113 = Questions(
            113, "Параметр loadFactory у отображения HashMap по-умолчанию равен:",
            R.drawable.android_question,
            "0.5", "0.8",
            "0.75", "1.0", 3
        )
        questionsList.add(que113)
        val que114 = Questions(
            114, "Укажите суперкласс для классов Exception и Error?",
            R.drawable.android_question,
            "Catched", "Errors",
            "Throwable", "Checked", 3
        )
        questionsList.add(que114)
        val que115 = Questions(
            115, "Для создания класса checked исключения необходимо",
            R.drawable.android_question,
            "указать ключевое слово checked в объявлении класса", "унаследовать его только от класса Exception",
            "унаследовать его от класса RuntimeException", "унаследовать его от класса checked исключения", 4
        )
        questionsList.add(que115)
        val que116 = Questions(
            116, "Какой пакет импортирован по умолчанию?",
            R.drawable.android_question,
            "java.util", "java.lang",
            "java.core", "java.io", 2
        )
        questionsList.add(que116)
        val que117 = Questions(
            117, "Какой метод нужно выполнить у класса Thread для запуска нового потока?",
            R.drawable.android_question,
            "start()", "run()",
            "execute()", "submit()", 1
        )
        questionsList.add(que117)
        val que118 = Questions(
            118, "Выберите верное утверждение о ключевом слове final",
            R.drawable.android_question,
            "нельзя объявить абстрактный класс с модификаторами final", "можно переопределить методы с модификатором final",
            "абстрактный класс может быть объявлен с модификатором final", "можно менять значение final поля", 1
        )
        questionsList.add(que118)
        val que119 = Questions(
            119, "Подклассом класса IOException является:",
            R.drawable.android_question,
            "FileNotFoundException", "Exception",
            "RuntimeException", "NullPointerException", 1
        )
        questionsList.add(que119)
        val que120 = Questions(
            120, "Подклассом класса RuntimeException является",
            R.drawable.android_question,
            "IOException", "FileNotFoundException",
            "NullPointerException", "Exception", 3
        )
        questionsList.add(que120)
        val que121 = Questions(
            121, "Как называется класс, объявленный внутри метода?",
            R.drawable.android_question,
            "нельзя объявить класс внутри метода", "внутренний",
            "вложенный", "локальный", 4
        )
        questionsList.add(que121)
        val que122 = Questions(
            122, "При удалении элемента ArrayList методом remove()",
            R.drawable.android_question,
            "все элементы равные указанному", "случайный элемент, равный указанному",
            "метод remove() удаляет элемент только по индексу", "удаляется первый найденный элемент", 4
        )
        questionsList.add(que122)
        val que123 = Questions(
            123, "Выберите неверный способ создания объекта:",
            R.drawable.android_question,
            "HashSet<String> s = new TreeSet<String>()", "HashSet<String> s = new LinkedHashSet<String>()",
            "Set<String> s = new TreeSet<String>()", "Set<String> s = new HashSet<String>()", 1
        )
        questionsList.add(que123)
        val que124 = Questions(
            124, "Параметр loadFactory у отображения HashMap по-умолчанию равен:",
            R.drawable.android_question,
            "0.8", "1.0",
            "0.75", "0.5", 3
        )
        questionsList.add(que124)
        val que125 = Questions(
            125, "Какой из методов не может привести к приостановке потока?",
            R.drawable.android_question,
            "wait()", "join()",
            "sleep()", "notify()", 4
        )
        questionsList.add(que125)
        val que126 = Questions(
            126, "Объекты какого класса являются иммутабельными?",
            R.drawable.android_question,
            "StringBuffer", "StringBulder",
            "String", "ни один из вариантов", 3
        )
        questionsList.add(que126)
        val que127 = Questions(
            127, "Выберите верное утверждение",
            R.drawable.android_question,
            "и внутренний и внешний класс имеют доступ только к статическим членам другого класса", "внутренный класс имеет доступ только к открытым полям и методам внешнего класса, внешний класс имеет полный доступ ко всем полям и методам внутреннего",
            "внутренный класс имеет доступ ко всем полям и методам внешнего класса, внешний класс не имеет прямого доступ ко всем полям и методам внутреннего класса", "внутренный класс имеет полный доступ ко всем полям и методам внешнего класса, внешний класс имеет полный доступ ко всем полям и методам внутреннего", 4
        )
        questionsList.add(que127)
        val que128 = Questions(
            128, "LinkedHashSet хранит элементы в порядке",
            R.drawable.android_question,
            "добавления", "случайном",
            "отсортированном через compareTo()", "отсортированном по возрастанию hashCode()", 1
        )
        questionsList.add(que128)
        val que129 = Questions(
            129, "Назовите две группы исключений в Java:",
            R.drawable.android_question,
            "Handle и Unhandled", "Catched и Uncatched",
            "Exception и Error", "Checked и Unchecked", 4
        )
        questionsList.add(que129)
        val que130 = Questions(
            130, "Укажите суперкласс для классов Exception и Error?",
            R.drawable.android_question,
            "Throwable", "Checked",
            "Catched", "Errors", 1
        )
        questionsList.add(que130)
        val que131 = Questions(
            131, "Выберите верное утверждение",
            R.drawable.android_question,
            "HashMap допускает в качестве ключа использовать null, Hashtable - не позволяет", "все утверждения верны",
            "и Hashtable, и HashMap не синхронизированы", "и Hashtable, и HashMap синхронизированы", 1
        )
        questionsList.add(que131)
        val que132 = Questions(
            132, "Какой из вариантов создания объекта недопустим?",
            R.drawable.android_question,
            "Collection<String, Integer> map = new HashMap<>();", "Map<String, Integer> map = new HashMap<>();",
            "NavigableMap<String, Integer> map = new TreeMap<>();", "HashMap<String, Integer> map = new LinkedHashMap<>();", 1
        )
        questionsList.add(que132)
        val que133 = Questions(
            133, "Какой метод в HashMap предоставляет возможность получить ключ по значению?",
            R.drawable.android_question,
            "такой метод не предусмотрен", "getKey()",
            "get()", "findKey()", 1
        )
        questionsList.add(que133)
        val que134 = Questions(
            134, "Если несколько потоков должны работать с отображением Map, какой из классов желательно использовать?",
            R.drawable.android_question,
            "java.util.concurrent.ConcurrentHashMap", "java.util.ParallelHashMap",
            "java.util.LinkedHashMap", "java.util.HashMap", 1
        )
        questionsList.add(que134)
        val que135 = Questions(
            135, "Какой метод нужно выполнить у класса Thread для запуска нового потока?",
            R.drawable.android_question,
            "start()", "run()",
            "execute()", "submit()", 1
        )
        questionsList.add(que135)
        val que136 = Questions(
            136, "За что отвечает метод ensureCapacity(int n) в классе ArrayList?",
            R.drawable.android_question,
            "увеличивает емкость коллекции до n, если она меньше n", "возвращает true если емкость коллекции больше n",
            "увеличивает емкость коллекции на n элементов", "уменьшает емкость коллекции до n, если она больше n", 1
        )
        questionsList.add(que136)
        val que137 = Questions(
            137, "Выберите верное утверждение о ключевом слове final",
            R.drawable.android_question,
            "нельзя объявить абстрактный класс с модификаторами final", "можно переопределить методы с модификатором final",
            "можно менять значение final поля", "абстрактный класс может быть объявлен с модификатором final", 1
        )
        questionsList.add(que137)
        val que138 = Questions(
            138, "Выберите неверное утверждение",
            R.drawable.android_question,
            "LinkedHashSet хранит элементы в порядке добавления", "TreeSet представляет собой отсортированное множество",
            "в HashSet элементы упорядочены по возрастанию", "в HashSet хранятся только уникальные элементы", 3
        )
        questionsList.add(que138)
        val que139 = Questions(
            139, "При попытке вызвать метод у не созданного объекта будет сгенерировано исключение:",
            R.drawable.android_question,
            "NullPointerException", "IllegalArgumentException",
            "IOException", "ClassCastException", 1
        )
        questionsList.add(que139)
        val que140 = Questions(
            140, "Какое условие необходимо выполнить для использования класса в качестве ключа HashMap?",
            R.drawable.android_question,
            "переопределить методы hashCode() и equals()", "переопределить только метод equals()",
            "переопределить только метод hashCode()", "реализовать интерфейс Serializable", 1
        )
        questionsList.add(que140)
        val que141 = Questions(
            141, "Выберите верное утверждение",
            R.drawable.android_question,
            "RuntimeException - checked, Exception - unchecked", "RuntimeException - unchecked, Exception - unchecked",
            "RuntimeException - checked, Exception - checked", "RuntimeException - unchecked, Exception - checked", 4
        )
        questionsList.add(que141)
        val que142 = Questions(
            142, "При выполнении static synchronized метода в роли монитора выступает?",
            R.drawable.android_question,
            "объект, у которого вызвали этот метод", "класс",
            "нельзя указывать модификатор synchronized у static метода", "одно из полей объекта", 2
        )
        questionsList.add(que142)
        val que143 = Questions(
            143, "Выберите верное утверждение",
            R.drawable.android_question,
            "внутренний класс имеет полный доступ ко всем полям и методам внешнего класса, внешний класс имеет полный доступ ко всем полям и методам внутреннего", "и внутренний и внешний класс имеют доступ только к статическим членам другого класса",
            "внутренний класс имеет доступ только к открытым полям внешнего класса, внешний класс имеет полный доступ ко всем полям и методам внутреннего", "внутренний класс имеет доступ ко всем полям и методам внешнего класса, внешний класс не имеет прямого доступа к полям и методам внутреннего класса", 4
        )
        questionsList.add(que143)
        val que144 = Questions(
            144, "Какая из коллекций является синхронизированной?",
            R.drawable.android_question,
            "Vector", "ArrayList",
            "SynchronizedArrayList", "HashSet", 1
        )
        questionsList.add(que144)
        val que145 = Questions(
            145, "С какими типами данных не могут работать обобщения?",
            R.drawable.android_question,
            "final", "ссылочными",
            "примитивными", "abstract", 3
        )
        questionsList.add(que145)
        val que146 = Questions(
            146, "Какие ограничения накладываются на обобщённые классы?",
            R.drawable.android_question,
            "внутри класса нельзя создавать объекты и массивы обобщенного типа", "нельзя создавать объекты обобщенных классов",
            "классы не могут быть обобщенными", "объекты обобщенных классов нельзя добавлять в коллекции", 1
        )
        questionsList.add(que146)
        val que147 = Questions(
            147, "Что возвращает метод executeUpdate()?",
            R.drawable.android_question,
            "тип выполненной операции", "true при успешно выполненном  запросе, и false в противном случае",
            "ничего не возвращает", "количество измененных записей в БД", 4
        )
        questionsList.add(que147)
        val que148 = Questions(
            148, "При использовании CachedThreadPool",
            R.drawable.android_question,
            "можно установить максимальное количество потоков, но нельзя уменьшить количество уже созданных потоков", "нельзя установить максимальное количество потоков, и нельзя уменьшить количество уже созданных потоков",
            "можно установить максимальное количество потоков, и уменьшить количество уже созданных потоков", "можно уменьшить количество уже созданных потоков, но нельзя установить максимальное количество потоков", 2
        )
        questionsList.add(que148)
        val que149 = Questions(
            149, "Выберите неправильный вариант запроса",
            R.drawable.android_question,
            "INSERT INTO students name = 'Bob', score = 20;", "SELECT name FROM students WHERE score < 50;",
            "INSERT INTO students (name, score) VALUES ('Bob', 20);", "SELECT * FROM students;", 1
        )
        questionsList.add(que149)
        val que150 = Questions(
            150, "Какой из типов данных не является интерфейсом?",
            R.drawable.android_question,
            "Statement", "ResultSet",
            "DriverManager", "Connection", 3
        )
        questionsList.add(que150)
        val que151 = Questions(
            151, "Какой класс или интерфейс предоставляет средства управления транзакциями: setAutoCommit(), commit(), rollback()?",
            R.drawable.android_question,
            "Transaction", "DriverManager",
            "Statement", "Connection", 4
        )
        questionsList.add(que151)
        val que152 = Questions(
            152, "Что из себя представляет объект класса File",
            R.drawable.android_question,
            "абстрактное описание пути к файлу", "ссылку на конкретный файл или каталог",
            "нельзя создать объект типа File, поскольку класс File является абстрактным", "ссылку на конкретный файл", 1
        )
        questionsList.add(que152)
        val que153 = Questions(
            153, "В чем смысл использования ReentrantReadWriteLock?",
            R.drawable.android_question,
            "позволяет ограничить доступ к критической секции только на использование одной операции, либо для чтения, либо для записи", "не позволяет читать данные, пока хотя бы один поток записывает данные, при этом количество пишущих потоков не граничено",
            "позволяет узнать какая операция (чтение или запись) производится в критической секции в настоящее время", "позволяет многим потокам одновременно получить доступ на чтение, и только одному на запись, при этом в единицу времени может производиться либо только чтение, либо только запись", 4
        )
        questionsList.add(que153)
        val que154 = Questions(
            154, "У какого из типов данных нельзя запросить класс:",
            R.drawable.android_question,
            "Class", "String",
            "void", "все представленные типы имеют классы", 4
        )
        questionsList.add(que154)
        val que155 = Questions(
            155, "В чем особенность ScheduledExecutorService?",
            R.drawable.android_question,
            "позволяет менять количество активных потоков", "хранит в себе результаты выполнения потоков",
            "позволяет запускать задачи по расписанию", "позволяет запускать задачи через интерфейс Callable", 3
        )
        questionsList.add(que155)
        val que156 = Questions(
            156, "Как называется абстрактный базовый класс для чтения потоков данных в байтовом представлении?",
            R.drawable.android_question,
            "Reader", "Stream",
            "FileInputStream", "InputStream", 4
        )
        questionsList.add(que156)
        val que157 = Questions(
            157, "Какой запрос позволит очистить таблицу students в SQLite?",
            R.drawable.android_question,
            "REMOVE students;", "DELETE * FROM students;",
            "DELETE FROM students;", "DELETE * IN students;", 2
        )
        questionsList.add(que157)
        val que158 = Questions(
            158, "Какой класс не входит в пакет java.lang.reflect?",
            R.drawable.android_question,
            "Package", "Constructor",
            "Method", "Object", 1
        )
        questionsList.add(que158)
        val que159 = Questions(
            159, "При использовании ReentrantReadWriteLock",
            R.drawable.android_question,
            "все утверждения не верны", "при захвате writeLock все потоки, захватившие readLock, освоббождаются",
            "потоки могут одновременно захватывать и readLock и writeLock", "только один поток может получить доступ к записи, и множество потоков могут получить одновременный доступ к чтению", 4
        )
        questionsList.add(que159)
        val que160 = Questions(
            160, "Выберите неправильный вариант запроса",
            R.drawable.android_question,
            "SELECT * FROM students;", "UPDATE students SET score = 100 WHERE name = 'Bob';",
            "UPDATE score = 100 INTO students WHERE name 'Bob';", "DELETE FROM students;", 3
        )
        questionsList.add(que160)
        val que161 = Questions(
            161, "Выберите неверное утверждение",
            R.drawable.android_question,
            "RandomAccessFile реализует интерфейсы DataInput и DataOutput", "RandomAccessFile реализует интерфейс Closeable",
            "RandomAccessFile предоставляет одновременный доступ на чтение и запись", "RandomAccessFile реализует интерфейсы InputStream и OutputStream", 2
        )
        questionsList.add(que161)
        val que162 = Questions(
            162, "Какой метод должен быть переопределен классом, реализующим интерфейс Runnable для выполнения задачи в отдельном потоке?",
            R.drawable.android_question,
            "void run()", "int run()",
            "boolean run()", "void run(int priority)", 1
        )
        questionsList.add(que162)
        val que163 = Questions(
            163, "Какой класс или интерфейс позволяет отсылать запросы в БД?",
            R.drawable.android_question,
            "SecureStatement", "PrecompiledStatement",
            "RollableStatement", "QuerySstatement", 4
        )
        questionsList.add(que163)
        val que164 = Questions(
            164, "В чем особенность SequenceInputStream?",
            R.drawable.android_question,
            "позволяет зацикленно читать один и тот же файл", "позволяет работать с несколькими потоками ввода, как с одним",
            "позволяет выбрать направление чтения файла, от начала к концу, либо с конца в начало", "предоставляет последовательный доступ к файлу", 3
        )
        questionsList.add(que164)
        val que165 = Questions(
            165, "Что делает метод reset() в классе ObjectOutputStream?",
            R.drawable.android_question,
            "очищает файл, в который производилась запись", "повторно записывает объекты в файл",
            "делает откат к ранее установленному состоянию", "сбрасывает информацию об уже записанных объектах в файл", 4
        )
        questionsList.add(que165)
        val que166 = Questions(
            166, "Какова основная задача интерфейса PreparedStatement?",
            R.drawable.android_question,
            "выполнение хранимых процедур", "получение информации о состоянии БД",
            "выполнять параметрические запросы", "получение информации о таблицах", 3
        )
        questionsList.add(que166)
        val que167 = Questions(
            167, "Какой метод следует использовать для выполнения запросов INSERT и UPDATE?",
            R.drawable.android_question,
            "executeQuery()", "executeResult()",
            "executeUpdate()", "execute()", 3
        )
        questionsList.add(que167)
        val que168 = Questions(
            168, "Какой из типов данных не является интерфейсом?",
            R.drawable.android_question,
            "Connection", "Statement",
            "ResultSet", "DriverManager", 4
        )
        questionsList.add(que168)
        val que169 = Questions(
            169, "Какой запрос позволит очистить таблицу students в SQLLite?",
            R.drawable.android_question,
            "Delete * FROM students;", "Delete from students;",
            "Delete students;", "Delete * IN students;", 2
        )
        questionsList.add(que169)
        val que170 = Questions(
            170, "При использовании ReentrantReadWriteLock",
            R.drawable.android_question,
            "все утверждения не верны", "при захвате writelock  все потоки, захватившие readlock, освобождаются",
            "только один поток может получить доступ к записи, и множество потоков могут получить одновременный доступ к чтению", "потоки могут одновременно захватить и readLock и writeLock", 3
        )
        questionsList.add(que170)
        val que171 = Questions(
            171, "Что произойдет при выполнении задачи через интерфейс Callable и попытке запросить результат работы потока с помощью метода  get() до его завершения?",
            R.drawable.android_question,
            "будет брошено IllegalStateException", "поток, запросивший результат выполнения, перейдет в режим ожидания",
            "вернется null", "будет брошено InterruptedException", 2
        )
        questionsList.add(que171)
        val que172 = Questions(
            172, "Какой фреймворк предназначен для написания юнит-тестов",
            R.drawable.android_question,
            "JTest", "Maven",
            "JUnit", "Gradle", 3
        )
        questionsList.add(que172)
        val que173 = Questions(
            173, "Выберите верное утверждение",
            R.drawable.android_question,
            "Class.getDeclaredMethods() позволяет получить массив всех открытых методов обьявленных только внутри класса, Class.getMethods() позволяет получить массив всех открытых методов класса, в том числе доставшихся ему от родительских классов", "Class.getDeclaredMethods() позволяет получить массив всех методов класса, Class.getMethods() позволяет получить массив всех открытых методов класса, в том числе доставщихся ему от родительских классов",
            "Class.getDeclaredMethods() позволяет получить массив всех методов обьявленых только внутри класса, Class.getMethods() позволяет получить массив всех открытых методов класса, в том числе доставшихся ему от родительских классов", "Class.getDeclaredMethods() позволяет получить массив всех открытых методов обьявленных только внутри класса, Class.getMethods() позволяет получить массив всех открытых методов класса, обьявленных только внутри класса", 2
        )
        questionsList.add(que173)
        val que174 = Questions(
            174, "Какая проверка отсуствует в классе Assert?",
            R.drawable.android_question,
            "assertSame", "assertArrayEquals",
            "assertReference", "assertEquals", 3
        )
        questionsList.add(que174)
        val que175 = Questions(
            175, "В чем особенность ScheduledExecutorService?",
            R.drawable.android_question,
            "позволяет запускать задачи по расписанию", "позволяет запускать задачи через интерфейс Callable",
            "позволяет менять количество активных потоков", "хранит в себе результаты выполнения потоков", 1
        )
        questionsList.add(que175)
        val que176 = Questions(
            176, "За что отвечает метод flush()?",
            R.drawable.android_question,
            "чтения файла с байтовый массив", "принудительная очистка буфера и запись данных в поток",
            "закрытие потока", "приостановку записи", 2
        )
        questionsList.add(que176)
        val que177 = Questions(
            177, "Что из себя представляет обьект  класса File",
            R.drawable.android_question,
            "ссылку на конкретный файл или каталог", "нельзя создать обьект типа File, поскольку класс File является абстрактным",
            "ссылку на конкректный файл", "абастрактное описание пути к файлу", 4
        )
        questionsList.add(que177)
        val que178 = Questions(
            178, "Что произойдет при попытке выполнить некорректно сформированный SQL запрос?",
            R.drawable.android_question,
            "соединение с базой данных будет автоматически закрыто и программа продолжит работу", "будет выброшено SQLException",
            "будет выброшено NullPointerException", "метод execute() вернет false, а метод executeQuery() - null", 2
        )
        questionsList.add(que178)
        val que179 = Questions(
            179, "В каком пакете находятся коллекции для работы с многопоточностью?",
            R.drawable.android_question,
            "java.collections", "java.lang",
            "java.util.collections", "java.util.concurrent", 4
        )
        questionsList.add(que179)
        val que180 = Questions(
            180, "Какой из классов может выполнять запросы вида \"Select * from students Where name=? AND score=?;\"",
            R.drawable.android_question,
            "PreparedStatement", "CallableStatement",
            "QueryStatement", "Statement", 1
        )
        questionsList.add(que180)
        val que181 = Questions(
            181, "Какой размер имеет переменная типа int в Java?",
            R.drawable.android_question,
            "1 байт", "4 байта",
            "8 байт", "Не знаю", 2
        )
        questionsList.add(que181)
        val que182 = Questions(
            182, "Как вернуть число 0 из метода public int foo()?",
            R.drawable.android_question,
            "exit 0;", "int 0;",
            "return 0;", "Не знаю", 3
        )
        questionsList.add(que182)
        val que183 = Questions(
            183, "Как правильно написать цикл, который отработает 10 раз?",
            R.drawable.android_question,
            "for (i = 0; i &lt; 9; i++) {}", "for (int i = 0; i &lt; 10; i++) {}",
            "for (i = 0; i &lt; 10; i++) {}", "Не знаю", 2
        )
        questionsList.add(que183)
        val que184 = Questions(
            184, "Как реализовать многомерные массивы в Java?",
            R.drawable.android_question,
            "Вложить одномерные в одномерные", "Массивы всегда многомерны",
            "Не понял вопрос", "Не знаю", 1
        )
        questionsList.add(que184)
        val que185 = Questions(
            185, "Можно ли из статического метода вызвать нестатический метод этого же класса?",
            R.drawable.android_question,
            "Да", "Нет",
            "Не обязательно", "Не знаю", 2
        )
        questionsList.add(que185)
        val que186 = Questions(
            186, "Какое преобразование безопасно?",
            R.drawable.android_question,
            "Потомков в предков", "Предков в потомков",
            "Все опасны", "Все безопасны", 1
        )
        questionsList.add(que186)
        val que187 = Questions(
            187, "Как в конструкторе класса вызвать другой конструктор этого же класса?",
            R.drawable.android_question,
            "названиеКласса", "constructor()",
            "super()", "this()", 4
        )
        questionsList.add(que187)
        val que188 = Questions(
            188, "Когда модификатор доступа не указан, какой подразумевается?",
            R.drawable.android_question,
            "default", "public",
            "private", "protected", 1
        )
        questionsList.add(que188)
        val que189 = Questions(
            189, "Можно ли в интерфейсе иметь статические переменные?",
            R.drawable.android_question,
            "Да, они же будут final", "Да, и необязательно им быть константами",
            "Нет", "Не знаю", 1
        )
        questionsList.add(que189)
        val que190 = Questions(
            190, "Можно ли вручную создать экземпляр абстрактного класса?",
            R.drawable.android_question,
            "Через abstract", "Только из метода класса потомка",
            "Нет", "Да", 3
        )
        questionsList.add(que190)
        val que191 = Questions(
            191, "Что означает final при определении класса?",
            R.drawable.android_question,
            "Нельзя сделать потомка этого класса", "Все переменные класса неизменные",
            "Класс виден только в текущем пакете", "Не знаю", 1
        )
        questionsList.add(que191)
        val que192 = Questions(
            192, "Принадлежит ли Map к иерархии Collection?",
            R.drawable.android_question,
            "Да", "Нет",
            "Конечно, ведь это коллекция", "Не знаю", 2
        )
        questionsList.add(que192)
        val que193 = Questions(
            193, "Чем примечателен интерфейс Set?",
            R.drawable.android_question,
            "Только уникальные элементы, нет порядка", "Можно хранить дубликаты, порядок есть",
            "Только уникальные элементы и хранит порядок", "Не знаю", 1
        )
        questionsList.add(que193)
        val que194 = Questions(
            194, "Чем примечателен интерфейс List?",
            R.drawable.android_question,
            "Только уникальные элементы, нет порядка", "Можно хранить дубликаты, порядок есть",
            "Только уникальные элементы и хранит порядок", "Не знаю", 2
        )
        questionsList.add(que194)
        val que195 = Questions(
            195, "В какой версии появился механизм try-with-resources?",
            R.drawable.android_question,
            "5", "6",
            "7", "Не знаю", 3
        )
        questionsList.add(que195)
        val que196 = Questions(
            196, "Какие исключения необходимо пробрасывать или обрабатывать?",
            R.drawable.android_question,
            "Все", "Неконтролируемые",
            "Контролируемые", "Не знаю", 3
        )
        questionsList.add(que196)
        val que197 = Questions(
            197, "Как в сигнатуре метода указать, что метод может выбросить исключение?",
            R.drawable.android_question,
            "throw", "throws",
            "return", "Не знаю", 2
        )
        questionsList.add(que197)
        val que198 = Questions(
            198, "Можно ли принудительно остановить поток?",
            R.drawable.android_question,
            "Всегда можно, это не опасно", "Можно, но не рекомендуется",
            "Нельзя", "Не знаю", 3
        )
        questionsList.add(que198)
        val que199 = Questions(
            199, "Какой объект может быть ключом?",
            R.drawable.android_question,
            "Любой", "Потомок Thread",
            "Реализующий Runnable", "Не знаю", 1
        )
        questionsList.add(que199)

        return questionsList
    }
}