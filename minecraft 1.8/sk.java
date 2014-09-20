/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ import com.mojang.authlib.ProfileLookupCallback;
/*   3:    */ import java.util.List;
/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ import org.apache.logging.log4j.Logger;
/*   6:    */ 
/*   7:    */ final class sk
/*   8:    */   implements ProfileLookupCallback
/*   9:    */ {
/*  10:    */   sk(MinecraftServer paramMinecraftServer, List paramList) {}
/*  11:    */   
/*  12:    */   public void onProfileLookupSucceeded(GameProfile paramGameProfile)
/*  13:    */   {
/*  14:253 */     this.a.aD().a(paramGameProfile);
/*  15:254 */     this.b.add(paramGameProfile);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void onProfileLookupFailed(GameProfile paramGameProfile, Exception paramException)
/*  19:    */   {
/*  20:259 */     sf.a().warn("Could not lookup user whitelist entry for " + paramGameProfile.getName(), paramException);
/*  21:    */   }
/*  22:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     sk
 * JD-Core Version:    0.7.0.1
 */