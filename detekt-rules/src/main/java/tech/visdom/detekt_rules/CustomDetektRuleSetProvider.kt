package tech.visdom.detekt_rules

import io.gitlab.arturbosch.detekt.api.Config
import io.gitlab.arturbosch.detekt.api.RuleSet
import io.gitlab.arturbosch.detekt.api.RuleSetProvider

class CustomDetektRuleSetProvider : RuleSetProvider {

    override val ruleSetId = "custom-detekt-rules"

    override fun instance(config: Config) = RuleSet(
        id = ruleSetId,
        rules = listOf(
            // тут будет наше правило
        )
    )
}