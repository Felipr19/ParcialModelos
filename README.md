@startuml

interface NotificationStrategy {
    +sendNotification(User user, Notification notification)
}

class InstantNotification implements NotificationStrategy {
    +sendNotification(User user, Notification notification)
}

class DailySummaryNotification implements NotificationStrategy {
    +sendNotification(User user, Notification notification)
}

class WeeklySummaryNotification implements NotificationStrategy {
    +sendNotification(User user, Notification notification)
}

class BalanceAlertNotification implements NotificationStrategy {
    +sendNotification(User user, Notification notification)
}

class PromotionNotification implements NotificationStrategy {
    +sendNotification(User user, Notification notification)
}

class NotificationContext {
    -strategy: NotificationStrategy
    +setStrategy(NotificationStrategy strategy)
    +notify(User user, Notification notification)
}

class User {
    -name: String
    -email: String
    -phoneNumber: String
}

class Notification {
    -message: String
    -type: String
}

NotificationContext --> NotificationStrategy : uses
NotificationContext --> User
NotificationContext --> Notification

NotificationStrategy <|-- InstantNotification
NotificationStrategy <|-- DailySummaryNotification
NotificationStrategy <|-- WeeklySummaryNotification
NotificationStrategy <|-- BalanceAlertNotification
NotificationStrategy <|-- PromotionNotification

@enduml
