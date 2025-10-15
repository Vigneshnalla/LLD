# Design Principles Project Changelog

All notable changes to this project are documented here, including versions and why changes were made.

---

## [Design Principles v1] - Inheritance
**Date:** 2025-09-28

### Changes:
- Created basic Duck class with quack() and swim()
- Added MallardDuck and RedheadDuck subclasses
- Implemented DuckSimulator to demonstrate basic inheritance and behaviors

### Known Issues / Notes:
- No major issues in this initial version

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
