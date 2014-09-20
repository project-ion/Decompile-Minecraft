/*   1:    */ import com.google.common.collect.Maps;
/*   2:    */ import com.mojang.authlib.GameProfile;
/*   3:    */ import com.mojang.authlib.minecraft.InsecureTextureException;
/*   4:    */ import com.mojang.authlib.minecraft.MinecraftSessionService;
/*   5:    */ import java.util.HashMap;
/*   6:    */ import java.util.Map;
/*   7:    */ import java.util.UUID;
/*   8:    */ 
/*   9:    */ class cvz
/*  10:    */   implements Runnable
/*  11:    */ {
/*  12:    */   cvz(cvw paramcvw, GameProfile paramGameProfile, boolean paramBoolean, cwb paramcwb) {}
/*  13:    */   
/*  14:    */   public void run()
/*  15:    */   {
/*  16: 97 */     HashMap localHashMap = Maps.newHashMap();
/*  17:    */     try
/*  18:    */     {
/*  19:100 */       localHashMap.putAll(cvw.a(this.d).getTextures(this.a, this.b));
/*  20:    */     }
/*  21:    */     catch (InsecureTextureException localInsecureTextureException) {}
/*  22:104 */     if ((localHashMap.isEmpty()) && (this.a.getId().equals(bsu.z().K().e().getId()))) {
/*  23:105 */       localHashMap.putAll(cvw.a(this.d).getTextures(cvw.a(this.d).fillProfileProperties(this.a, false), false));
/*  24:    */     }
/*  25:108 */     bsu.z().a(new cwa(this, localHashMap));
/*  26:    */   }
/*  27:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cvz
 * JD-Core Version:    0.7.0.1
 */