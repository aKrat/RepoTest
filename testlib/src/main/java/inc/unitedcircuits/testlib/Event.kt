package inc.unitedcircuits.testlib

enum class EventType {Error, Info, Start, Stop}

class Event(val message: String, val type: EventType)