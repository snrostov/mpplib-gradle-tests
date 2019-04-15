set +x
set -e

cd ~/kotlin
./gradlew :kotlin-gradle-plugin:install

cd /Users/jetbrains/IdeaProjects/mpplib2
./gradlew $@