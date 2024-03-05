package com.disablefireworkrocketplaced.apt;
import com.disablefireworkrocketplaced.apt.rewrite.FireworkRocket;
import net.fabricmc.api.ModInitializer;

public class Main_entrance implements ModInitializer {
	@Override
	public void onInitialize() {new FireworkRocket().onInitialize();}
}