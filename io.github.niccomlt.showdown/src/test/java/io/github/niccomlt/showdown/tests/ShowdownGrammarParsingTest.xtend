/*
 * generated by Xtext 2.21.0
 */
package io.github.niccomlt.showdown.tests

import com.google.inject.Inject
import io.github.niccomlt.showdown.showdownGrammar.Team
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(ShowdownGrammarInjectorProvider)
class ShowdownGrammarParsingTest {
	@Inject
	ParseHelper<Team> parseHelper
	
	@Test
	def void loadModel() {
		val result = parseHelper.parse('''
			Ninetales @ Leftovers
			Ability: Drought
			EVs: 248 HP / 16 Def / 8 SpA / 220 SpD / 16 Spe
			Calm Nature
			- Roar
			- Ember
			- Pain Split
			- Flamethrower
		''')
		Assertions.assertNotNull(result)
		println(result.elements.map[e | e.moves.join(",")].join("\n"))
		val errors = result.eResource.errors
		Assertions.assertTrue(errors.isEmpty, '''Unexpected errors: «errors.join(", ")»''')
	}
}
