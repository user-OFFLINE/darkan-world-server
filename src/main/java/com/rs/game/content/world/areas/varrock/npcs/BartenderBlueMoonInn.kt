package com.rs.game.content.world.areas.varrock.npcs

import com.rs.engine.dialogue.*
import com.rs.game.content.miniquests.bar_crawl.BarCrawl.BarCrawlBars.Bars.BLUE_MOON_INN
import com.rs.game.content.miniquests.bar_crawl.BarCrawl.BarCrawlBars.isBarVisited
import com.rs.game.content.miniquests.bar_crawl.BarCrawl.BarCrawlBars.onBarCrawl
import com.rs.game.content.miniquests.bar_crawl.BarCrawl.Companion.hasCard
import com.rs.game.content.utils.BartenderUtils.buyBarcrawlDrink
import com.rs.game.content.utils.BartenderUtils.buyDrinkOrIngredients
import com.rs.game.model.entity.npc.NPC
import com.rs.game.model.entity.player.Player
import com.rs.lib.game.Item
import com.rs.plugin.annotations.ServerStartupEvent
import com.rs.plugin.kts.onNpcClick

class BartenderBlueMoonInn(p: Player, npc: NPC) {
    init {
        p.startConversation {
            npc(npc, HeadE.HAPPY_TALKING, "What can I do yer for?")
            options {
                if (!isBarVisited(p, BLUE_MOON_INN) && hasCard(p) && onBarCrawl(p)) {
                    op("I'm doing Alfred Grimhand's Barcrawl") {
                        player(HeadE.HAPPY_TALKING, "I'm doing Alfred Grimhand's Barcrawl. Do you have any ${BLUE_MOON_INN.drinkName}?")
                        npc(npc, HeadE.FRUSTRATED, "Oh no not another of you guys.")
                        npc(npc, HeadE.FRUSTRATED, "These barbarian barcrawls cause too much damage to my bar.")
                        npc(npc, HeadE.CALM, "You're going to have to pay me ${BLUE_MOON_INN.price} gold for the ${BLUE_MOON_INN.drinkName}.")
                        exec { buyBarcrawlDrink(p, BLUE_MOON_INN); }
                    }
                }
                op("A glass of your finest ale please.") {
                    player(HeadE.HAPPY_TALKING, "A glass of your finest ale please.")
                    npc(npc, HeadE.HAPPY_TALKING, "No problemo. That'll be 2 coins.")
                    exec { buyDrinkOrIngredients(p, npc, 2, Item(1917), true) }
                }
                op("Can you recommend where an adventurer might make his fortune?") {
                    player(HeadE.HAPPY_TALKING, "Can you recommend where an adventurer might make his fortune?")
                    npc(npc, HeadE.HAPPY_TALKING, "Ooh I don't know if I should be giving away information, makes the game too easy.")
                    options {
                        op("Oh ah well...") {
                            player(HeadE.SAD_MILD, "Oh ah well...")
                        }
                        op("Game? What are you talking about?") {
                            player(HeadE.SKEPTICAL_THINKING, "Game? What are you talking about?")
                            npc(npc, HeadE.TALKING_ALOT, "This world around us... is an online game... called RuneScape.")
                            player(HeadE.SKEPTICAL_THINKING, "Nope, still don't understand what you are talking about. What does 'online' mean?")
                            npc(npc, HeadE.TALKING_ALOT, "It's a sort of connection between magic boxes across the world, big boxes on people's desktops and little ones people can carry. They can talk to each other to play games.")
                            player(HeadE.AMAZED_MILD, "I give up. You're obviously completely mad!")
                        }
                        op("Just a small clue?") {
                            player(HeadE.HAPPY_TALKING, "Just a small clue?")
                            npc(npc, HeadE.HAPPY_TALKING, "Go and talk to the bartender at the Jolly Boar Inn, he doesn't seem to mind giving away clues.")
                        }
                    }
                }
                op("Do you know where I can get some good equipment?") {
                    player(HeadE.HAPPY_TALKING, "Do you know where I can get some good equipment?")
                    npc(npc, HeadE.HAPPY_TALKING, "Well, there's the sword shop across the road, or there's also all sorts of shops up around the market.")
                }
            }
        }
    }
}

@ServerStartupEvent
fun mapBartenderBlueMoonInn() {
    onNpcClick(733) { (player, npc) ->
        BartenderBlueMoonInn(player, npc)
    }
}
