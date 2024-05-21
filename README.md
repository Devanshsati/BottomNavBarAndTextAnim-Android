# BottomNavigationBar

This Android application demonstrates the use of the `AnimatedBottomBar` library for creating animated bottom navigation bars and the `render` library for applying animations to text views. The project utilizes Kotlin and ViewBinding for efficient UI management and animations.

## Features

- **Animated Bottom Navigation Bars**: Implemented using the `AnimatedBottomBar` library to provide visually appealing and interactive navigation.
- **Text View Animations**: Various animations applied to text views on click using the `render` library.
- **Efficient UI Management**: Structured with ViewBinding for seamless interaction between the UI components and the code.

## Project Structure

- **MainActivity**: The main entry point of the application, responsible for setting up and managing UI components and their interactions.
- **Layout Files**: XML layout files defining the structure and appearance of the UI elements, including text views and bottom navigation bars.

## Getting Started

### Prerequisites

- Android Studio
- Gradle
- Kotlin

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/bottomnavigationbar.git
   cd bottomnavigationbar
   ```
2. **Open the project in Android Studio:**
   - Open Android Studio.
   - Click on `Open an existing Android Studio project`.
   - Navigate to the cloned repository folder and select it.
3. **Sync the project with Gradle:**
   - Android Studio will prompt you to sync the project with Gradle files. Click `Sync Now`.

### Running the Application

1. **Connect an Android device** or start an Android emulator.
2. **Run the application**:
   - Click on the `Run` button in Android Studio or use the shortcut `Shift + F10`.

## Usage

### MainActivity

- The `MainActivity` initializes the animations for each text view.
- When a text view is clicked, a specific animation from the `render` library is applied, enhancing the user interaction with the UI.

### XML Layout

- The XML layout file defines the structure of the UI, including multiple text views and four instances of `AnimatedBottomBar`.
- Each `AnimatedBottomBar` is configured with properties such as `abb_selectedIndex`, `abb_tabs`, and other visual and interactive settings.

### AnimatedBottomBar

- `AnimatedBottomBar` instances provide a dynamic and interactive navigation experience, enhancing the overall usability and visual appeal of the application.

## Dependencies

Ensure the following dependencies are added to your `build.gradle` file:

- `androidx.appcompat:appcompat`
- `org.jetbrains.kotlin:kotlin-stdlib`
- `nl.joery.animatedbottombar:library`
- `com.github.tbuonomo:dotsindicator`
- `com.github.render:render`

## License

This project is licensed under the MIT License - see the LICENSE file for details.
