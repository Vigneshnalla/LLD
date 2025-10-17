# Design Principles Project Changelog

All notable changes to this project are documented here, including versions and why changes were made.

---
## [Design Principles v3] - Strategy Pattern & Design Principles
**Date:** 2025-10-17
### Changes:
- Introduced Strategy Pattern to handle varying behaviors dynamically.
- Encapsulated what varies: moved fly and quack behaviors into separate interfaces (FlyBehavior, QuackBehavior).
- Code to an interface, not an implementation: Duck class now interacts with behaviors through interfaces only.
- Favor composition over inheritance: Ducks now have-a behavior instead of is-a type.
- Behavior fields in Duck made private; setter methods added for controlled runtime changes.

### Benefits
- We get the benefit of REUSE without all the baggage that comes along with inheritance
- Setting Behavior dynamically, so that its behavior could change at runtime 
- Decoupled design — Ducks depend on interfaces, not concrete implementations. 
- Improved testability — Behaviors can be mocked or swapped easily for testing.
---

## [Design Principles v2] - Interfaces & Composition
**Date:** 2025-10-16
### Changes:
- Extracted behaviors from Duck into separate interfaces: Flyable and Quackable
- Duck now only contains common properties (name, color, size, isAlive) and shared methods (swim(), display())
- Duck Subclasses implement only the appropriate behaviors
- Enables flexible, decoupled, and composable behaviors.

### Known Issues / Notes:
- No Major issues currently, but there is no code reuse for behaviors implementations yet.
- Behaviors cannot be changed at runtime (e.g., switching fly or quack behaviors dynamically).
- **Temporary fix**: Default methods in interfaces are used, but behaviors still cannot be changed at runtime.
 
### Limitations of this approach
- Behavior Explosion: As you introduce new flying or quacking variations , the number of classes implementing these grow rapidly - making maintenance harder
- Tight coupling between Duck and Behavior
- Difficult Testing and Maintenance
---

## [Design Principles v1.1.1] - Temporary fly() fix for RubberDuck
**Date:** 2025-10-15

### Changes:
- RubberDuck overrides fly() to indicate it cannot fly
- Updated DuckSimulator to demonstrate temporary fix

### Known Issues / Notes:
- This is a temporary fix; inheritance still forces behavior on other ducks
- Future versions will use interfaces/composition to solve this properly

---

## [Design Principles v1.1] - Added fly() behavior
**Date:** 2025-10-15

### Changes:
- Added `fly()` method to base Duck class
- Updated MallardDuck and RedheadDuck to demonstrate flying
- Updated DuckSimulator to test fly behavior

### Known Issues / Notes:
- RubberDuck inherits fly() even though it cannot fly
- Shows limitation of using inheritance for all behaviors
- Will be refactored in future versions using interfaces/composition

---

## [Design Principles v1] - Inheritance
**Date:** 2025-09-28

### Changes:
- Created basic Duck class with quack() and swim()
- Added MallardDuck and RedheadDuck subclasses
- Implemented DuckSimulator to demonstrate basic inheritance and behaviors
