#java -jar src/selenium-server-standalone-3.141.59.jar -role hub


java -jar src/selenium-server-standalone-3.141.59.jar -role node -nodeConfig src/nodeconfig-android1.json
java -jar src/selenium-server-standalone-3.141.59.jar -role node -nodeConfig src/nodeconfig-android1.json


appium -p 4723 --nodeconfig src/nodeconfig-android1.json --default-capabilities '{"udid":"emulator-5554"}'
appium -p 4723 --nodeconfigsrc/nodeconfig-android2.json --default-capabilities '{"udid":"emulator-5556"}'
