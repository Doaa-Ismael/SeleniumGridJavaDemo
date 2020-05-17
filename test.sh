java -jar src/selenium-server-standalone-3.141.59.jar -role hub

java -jar src/selenium-server-standalone-3.141.59.jar -role node -nodeConfig src/nodeconfig-android1.json  -hub http://localhost:4444/grid/register
java -jar src/selenium-server-standalone-3.141.59.jar -role node -nodeConfig src/nodeconfig-android2.json  -hub http://localhost:4444/grid/register


appium -p 4723 --nodeconfig src/nodeconfig-android1.json --default-capabilities '{"udid":"emulator-5554"}'
appium -p 4724 --nodeconfig src/nodeconfig-android2.json --default-capabilities '{"udid":"emulator-5556"}'
