package poa.packetListener;

import lombok.Getter;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GlowMap1206 {


    @Getter
    public static Map<Player, List<Integer>> glowMap = new HashMap<>();//player -> target    removal handled in login


}
