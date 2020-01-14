import org.zaproxy.gradle.addon.AddOnStatus

version = "10"
extra["language"] = "English"

zapAddOn {
    addOnStatus.set(AddOnStatus.RELEASE)

    manifest {
        url.set("https://www.zaproxy.org/docs/desktop/")
        notBeforeVersion.set("2.9.0")
    }
}
