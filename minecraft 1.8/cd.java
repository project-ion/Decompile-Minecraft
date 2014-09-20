/*   1:    */ import java.util.List;
/*   2:    */ import net.minecraft.server.MinecraftServer;
/*   3:    */ 
/*   4:    */ public class cd
/*   5:    */   extends z
/*   6:    */ {
/*   7:    */   public String c()
/*   8:    */   {
/*   9: 19 */     return "playsound";
/*  10:    */   }
/*  11:    */   
/*  12:    */   public int a()
/*  13:    */   {
/*  14: 24 */     return 2;
/*  15:    */   }
/*  16:    */   
/*  17:    */   public String c(ae paramae)
/*  18:    */   {
/*  19: 29 */     return "commands.playsound.usage";
/*  20:    */   }
/*  21:    */   
/*  22:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  23:    */   {
/*  24: 34 */     if (paramArrayOfString.length < 2) {
/*  25: 35 */       throw new dp(c(paramae), new Object[0]);
/*  26:    */     }
/*  27: 38 */     int i = 0;
/*  28: 39 */     String str = paramArrayOfString[(i++)];
/*  29: 40 */     qw localqw = a(paramae, paramArrayOfString[(i++)]);
/*  30:    */     
/*  31: 42 */     brw localbrw = paramae.d();
/*  32:    */     
/*  33: 44 */     double d1 = localbrw.a;
/*  34: 45 */     if (paramArrayOfString.length > i) {
/*  35: 46 */       d1 = b(d1, paramArrayOfString[(i++)], true);
/*  36:    */     }
/*  37: 49 */     double d2 = localbrw.b;
/*  38: 50 */     if (paramArrayOfString.length > i) {
/*  39: 51 */       d2 = b(d2, paramArrayOfString[(i++)], 0, 0, false);
/*  40:    */     }
/*  41: 54 */     double d3 = localbrw.c;
/*  42: 55 */     if (paramArrayOfString.length > i) {
/*  43: 56 */       d3 = b(d3, paramArrayOfString[(i++)], true);
/*  44:    */     }
/*  45: 59 */     double d4 = 1.0D;
/*  46: 60 */     if (paramArrayOfString.length > i) {
/*  47: 61 */       d4 = a(paramArrayOfString[(i++)], 0.0D, 3.402823466385289E+038D);
/*  48:    */     }
/*  49: 64 */     double d5 = 1.0D;
/*  50: 65 */     if (paramArrayOfString.length > i) {
/*  51: 66 */       d5 = a(paramArrayOfString[(i++)], 0.0D, 2.0D);
/*  52:    */     }
/*  53: 69 */     double d6 = 0.0D;
/*  54: 70 */     if (paramArrayOfString.length > i) {
/*  55: 71 */       d6 = a(paramArrayOfString[i], 0.0D, 1.0D);
/*  56:    */     }
/*  57: 74 */     double d7 = d4 > 1.0D ? d4 * 16.0D : 16.0D;
/*  58: 75 */     double d8 = localqw.f(d1, d2, d3);
/*  59: 77 */     if (d8 > d7)
/*  60:    */     {
/*  61: 78 */       if (d6 <= 0.0D) {
/*  62: 79 */         throw new di("commands.playsound.playerTooFar", new Object[] { localqw.d_() });
/*  63:    */       }
/*  64: 82 */       double d9 = d1 - localqw.s;
/*  65: 83 */       double d10 = d2 - localqw.t;
/*  66: 84 */       double d11 = d3 - localqw.u;
/*  67: 85 */       double d12 = Math.sqrt(d9 * d9 + d10 * d10 + d11 * d11);
/*  68: 87 */       if (d12 > 0.0D)
/*  69:    */       {
/*  70: 88 */         d1 = localqw.s + d9 / d12 * 2.0D;
/*  71: 89 */         d2 = localqw.t + d10 / d12 * 2.0D;
/*  72: 90 */         d3 = localqw.u + d11 / d12 * 2.0D;
/*  73:    */       }
/*  74: 93 */       d4 = d6;
/*  75:    */     }
/*  76: 96 */     localqw.a.a(new jv(str, d1, d2, d3, (float)d4, (float)d5));
/*  77: 97 */     a(paramae, this, "commands.playsound.success", new Object[] { str, localqw.d_() });
/*  78:    */   }
/*  79:    */   
/*  80:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/*  81:    */   {
/*  82:103 */     if (paramArrayOfString.length == 2) {
/*  83:104 */       return a(paramArrayOfString, MinecraftServer.M().I());
/*  84:    */     }
/*  85:105 */     if ((paramArrayOfString.length > 2) && (paramArrayOfString.length <= 5)) {
/*  86:106 */       return a(paramArrayOfString, 2, paramdt);
/*  87:    */     }
/*  88:109 */     return null;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/*  92:    */   {
/*  93:114 */     return paramInt == 1;
/*  94:    */   }
/*  95:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cd
 * JD-Core Version:    0.7.0.1
 */