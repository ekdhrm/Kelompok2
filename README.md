<h1>Design and Implementation of an OOO Driver Transformation Simulator in Java</h1>

<h2>Group 2 Members:</h2>
    <ol>1. Christabelle Marjorie Halim - 2086022510020</ol>
    <ol>2. Evelyn Tjandinegara - 2086022510001</ol>
    <ol>3. Mario Ekadharma P. Ladjo - 2086022510017</ol>
    <ol>4. Jovian Pieter - 2086022510008</ol>
    <ol>5. Steven Wijaya - 2086022510021</ol>

<h2>Way to Compile and Run this Program:</h2>
    <h3>A. Compiling the Classes</h3>
    <ol>- Hop into the terminal, either within IDE or out of IDE;</ol>
    <ol>- Make sure that the terminal current location is within the project file;</ol>
    <ol>- type: 'javac -version', to ensure your device environment has a java;</ol>
    <ol>- then type: 'javac [filename].java', repeat for each java file in app/src/main/java/kelompok2 folder
    </br>------------------------------------------------------------------------------------------------------------
        <ul>1. App.java</ul>
        <ul>2. ComboRule.java</ul>
        <ul>3. CoreMedal.java</ul>
        <ul>4. MedalRepository.java</ul>
        <ul>5. OOODriver.java</ul>
        <ul>6. OScanner.java</ul>
        <ul>7. State.java</ul>
        <ul>8. TajadolDevice.java</ul>
        <ul>9. TransformationEngine.java</ul>
        <ul>10. TransformationException.java</ul>
    ------------------------------------------------------------------------------------------------------------
    </ol>
    <ol>then check on the app/bin/main/kelompok2 folder to check if all of the java file has its class file;</ol>
    <ol>and there you have done the compiling process.</ol>
    <h3>B. Running the Program</h3>
    <ol>- Hop into the App.java file located in app/src/main/java/kelompok2;</ol>
    <ol>- Locate the 'public static void main(String[] args) throws TransformerException, TransformationException';</ol>
    <ol>- Locate the Play button in the IDE, which mostlikely near right-top position;</ol>
    <ol><b>OR</b></ol>
    <ol>- back to the terminal;</ol>
    <ol>- type: '& 'D:\Uni-Life-Vault\Dev-Env\java\bin\java.exe' '@C:\Users\mario\AppData\Local\Temp\cp_4xmdllycw3mnlykwy2ywx6rq0.argfile' 'kelompok2.App'';</ol>

<h2>Key Features that implemented:</h2>
    <ul>1. Medals Storage (Medal Repository and Object)</ul>
    <ul>2. Store Medal into OOODriver (OOODriver)</ul>
    <ul>3. Validate Stored Medal in OOODriver</ul>
    <ul>4. Identifier the Stored Medal Combination, whether its a Full Combo, Mixed Combo, or Full Special Combo (ComboRule)</ul>
    <ul>5. Scanner Device that can Scan for Transformation, Re-Scan for Scanning Charge (OScanner)</ul>
    <ul>6. Invalid Medal Combination or Incomplete Stored Medal in OOO Driver Handling (TransformationException and TransformerException(Java's))</ul>
    <ul>7. Transformation Logic (TransformationEngine)</ul>
    <ul>---Bonus Features---</ul>
    <ul>1. Tajadol Bonus Device when in Tajadol Form - Full Combo (TajadolDevice)</ul>
    <ul>2. Transformation State (State)</ul>

<h2>Which classes demonstrate collections, generics, and exception handling:</h2>
    <ul>1. collections : MedalRepository</ul>
    <ul>2. generics : MedalRepository </ul>
    <ul>3. exception handling : TransformationException and TransformerException (Java's) </ul>