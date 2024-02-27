import java.io.File
import java.io.FileInputStream
import java.util.*

object Config {

    var githubUserName: String = ""
    var githubUserToken: String = ""

    @Throws(IllegalArgumentException::class)
    fun loadData(secretPropsFile: File) {
        val p = Properties()
        if (secretPropsFile.exists()) {
            FileInputStream(secretPropsFile).use { p.load(it) }
        }
        githubUserName = getKey("gpr.usr", p)
        githubUserToken = getKey("gpr.key", p)
    }

    private fun getKey(name: String, properties: Properties, failOnError: Boolean = false): String {
        val resource = properties.getProperty(name) ?: System.getenv(name)
        if (resource == null && failOnError) {
            throw IllegalArgumentException("$name Key is not configured in local.properties or environment variables.")
        } else {
            return resource
        }
    }
}