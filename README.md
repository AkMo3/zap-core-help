# [![](https://raw.githubusercontent.com/wiki/zaproxy/zaproxy/images/zap32x32.png)](https://www.owasp.org/index.php/ZAP) OWASP ZAP User Guide

Welcome to the OWASP Zed Attack Proxy (ZAP) User Guide.

This is available both as context sensitive help within ZAP and online here in the [wiki](https://github.com/zaproxy/zap-core-help/wiki).

The English help files are under the [/src/help/zaphelp](https://github.com/zaproxy/zap-core-help/tree/master/src/help/zaphelp) directory, so if you'd like to make a change, create a pull request against those files, and they will be updated in the wiki.

This User Guide has been translated into many languages, all of which are available via the [ZAP Marketplace](https://github.com/zaproxy/zap-extensions).

The most completely translated guides are also available online:

* [Filipino](https://github.com/zaproxy/zap-core-help-fil_PH/wiki/HelpIntro)
* [Indonesian](https://github.com/zaproxy/zap-core-help-id_ID/wiki/HelpIntro)
* [Portuguese, Brazilian](https://github.com/zaproxy/zap-core-help-pt_BR/wiki/HelpIntro)
* [Spanish](https://github.com/zaproxy/zap-core-help-es_ES/wiki/HelpIntro)
* [Turkish](https://github.com/zaproxy/zap-core-help-tr_TR/wiki/HelpIntro)

You can help translate those pages into other languages via the [OWASP ZAP Help Crowdin project](https://crowdin.com/project/owasp-zap-help).

## Building

The help add-ons are built with [Gradle], each add-on has its own project which is located under the `addOns` project/directory.
The add-ons are identified with the prefix `help_` followed by its locale, for example, for French the project name is `help_fr_FR`
while for Japanese it is `help_ja_JP`. The default help add-on, English, does not follow this rule, it's just identified with `help`.

To build all add-ons, simply run:

    ./gradlew build

in the main directory of the project, the add-ons will be placed in the directory `build/zapAddOn/bin/` of each project.

To build an add-on individually run:

    ./gradlew :addOns:<name>:build

replacing `<name>` with the name of the add-on (e.g. `help_es_ES`).


[Gradle]: https://gradle.org/