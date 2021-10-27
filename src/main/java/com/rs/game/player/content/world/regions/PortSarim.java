package com.rs.game.player.content.world.regions;

import com.rs.game.player.Player;
import com.rs.game.player.content.Skillcapes;
import com.rs.game.player.content.achievements.AchievementSystemDialogue;
import com.rs.game.player.content.achievements.SetReward;
import com.rs.game.player.content.dialogue.Conversation;
import com.rs.game.player.content.dialogue.Dialogue;
import com.rs.game.player.content.dialogue.HeadE;
import com.rs.game.player.content.dialogue.Options;
import com.rs.game.player.content.dialogue.impl.skillmasters.GenericSkillcapeOwnerD;
import com.rs.game.player.quests.Quest;
import com.rs.game.player.quests.handlers.knightssword.KnightsSword;
import com.rs.game.player.quests.handlers.knightssword.SquireKnightsSwordD;
import com.rs.game.player.quests.handlers.knightssword.ThurgoKnightsSwordD;
import com.rs.lib.game.Item;
import com.rs.lib.game.WorldTile;
import com.rs.plugin.annotations.PluginEventHandler;
import com.rs.plugin.events.DialogueOptionEvent;
import com.rs.plugin.events.ItemOnNPCEvent;
import com.rs.plugin.events.NPCClickEvent;
import com.rs.plugin.events.ObjectClickEvent;
import com.rs.plugin.handlers.ItemOnNPCHandler;
import com.rs.plugin.handlers.NPCClickHandler;
import com.rs.plugin.handlers.ObjectClickHandler;

@PluginEventHandler
public class PortSarim {
	
	public static ItemOnNPCHandler handleThurgoItem = new ItemOnNPCHandler(604) {
		@Override
		public void handle(ItemOnNPCEvent e) {
			if (e.getItem().getId() == 24303 || e.getItem().getId() == 24339) {
				e.getPlayer().sendOptionDialogue("Would you like Thurgo to "+(e.getItem().getId() == 24339 ? "repair" : "forge")+" your Royal Crossbow?", new String[] { "Yes, please (Requires a stabilizer, frame, sight, and spring)", "No, thanks." }, new DialogueOptionEvent() {
					@Override
					public void run(Player player) {
						if (option == 1) {
							if (player.getInventory().containsItems(new Item(24340), new Item(24342), new Item(24344), new Item(24346))) {
								player.getInventory().deleteItem(e.getItem().getId(), 1);
								player.getInventory().deleteItem(24340, 1);
								player.getInventory().deleteItem(24342, 1);
								player.getInventory().deleteItem(24344, 1);
								player.getInventory().deleteItem(24346, 1);
								player.getInventory().addItem(e.getItem().getId() == 24339 ? 24338 : 24337, 1);
								player.sendMessage("Thurgo "+(e.getItem().getId() == 24339 ? "repairs" : "forges")+" your Royal crossbow.");
							}
						}
					}
				});
			}
		}
	};

    public static NPCClickHandler handleThurgo = new NPCClickHandler(604) {
        @Override
        public void handle(NPCClickEvent e) {
            e.getPlayer().startConversation(new Conversation(e.getPlayer()) {
                {
                    addOptions("What would you like to say?", new Options() {
                        @Override
                        public void create() {
                            if(player.getQuestManager().getStage(Quest.KNIGHTS_SWORD) >= KnightsSword.FIND_DWARF)
                                option("About Knight's Sword.", new Dialogue()
                                    .addNext(()->{e.getPlayer().startConversation(new ThurgoKnightsSwordD(e.getPlayer()).getStart());}));
                            option("About that skill cape...", new Dialogue()
                                .addNext(()->{player.startConversation(new GenericSkillcapeOwnerD(player, 604,Skillcapes.Smithing));})
                            );
                        }
                    });
                    create();
                }
            });
        }
    };
	
	public static ObjectClickHandler handleEnterIceDungeon = new ObjectClickHandler(new Object[] { 9472 }) {
		@Override
		public void handle(ObjectClickEvent e) {
			e.getPlayer().setNextWorldTile(new WorldTile(3007, 9550, 0));
		}
	};
	
	public static ObjectClickHandler handleExitIceDungeon = new ObjectClickHandler(new Object[] { 32015 }, new WorldTile(3008, 9550, 0)) {
		@Override
		public void handle(ObjectClickEvent e) {
			e.getPlayer().setNextWorldTile(new WorldTile(3008, 3149, 0));
		}
	};
	
	public static ObjectClickHandler handleEnterWyvern = new ObjectClickHandler(new Object[] { 33173 }) {
		@Override
		public void handle(ObjectClickEvent e) {
			e.getPlayer().setNextWorldTile(new WorldTile(3056, 9555, 0));
		}
	};
	
	public static ObjectClickHandler handleExitWyvern = new ObjectClickHandler(new Object[] { 33174 }) {
		@Override
		public void handle(ObjectClickEvent e) {
			e.getPlayer().setNextWorldTile(new WorldTile(3056, 9562, 0));
		}
	};
}
