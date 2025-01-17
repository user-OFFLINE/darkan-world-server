// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
//  Copyright (C) 2021 Trenton Kress
//  This file is part of project: Darkan
//
package com.rs.game.content.bosses.glacor;

import com.rs.game.World;
import com.rs.game.model.entity.npc.NPC;
import com.rs.lib.game.Tile;
import kotlin.Pair;

public class SappingMinion extends NPC {

	public Glacor parent;
	public boolean defeated = false;

	public SappingMinion(int id, Tile tile, int mapAreaNameHash, boolean canBeAttackFromOutOfArea, boolean spawned, Glacor parent) {
		super(id, tile, spawned);
		this.parent = parent;
		setForceAgressive(true);
		setForceMultiAttacked(true);
	}

	@Override
	public void processEntity() {
		super.processEntity();
		if (getHitpoints() <= 0 || isDead()) {
			if (!defeated)
				World.sendProjectile(this, parent, 634, new Pair<>(34, 16), 30, 10, 16);
			defeated = true;
		}
	}

}
