package jolchu.tolik.expandablerecyclerview

data class LanguageData(
    val title: String,
    val logo: Int,
    val desc: String,
    var isExpandable: Boolean = false
)