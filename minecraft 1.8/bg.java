/*   1:    */ import java.util.Collection;
/*   2:    */ import java.util.List;
/*   3:    */ import net.minecraft.server.MinecraftServer;
/*   4:    */ 
/*   5:    */ public class bg
/*   6:    */   extends z
/*   7:    */ {
/*   8:    */   public String c()
/*   9:    */   {
/*  10: 22 */     return "effect";
/*  11:    */   }
/*  12:    */   
/*  13:    */   public int a()
/*  14:    */   {
/*  15: 27 */     return 2;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public String c(ae paramae)
/*  19:    */   {
/*  20: 32 */     return "commands.effect.usage";
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  24:    */   {
/*  25: 37 */     if (paramArrayOfString.length < 2) {
/*  26: 38 */       throw new dp("commands.effect.usage", new Object[0]);
/*  27:    */     }
/*  28: 41 */     xm localxm = (xm)a(paramae, paramArrayOfString[0], xm.class);
/*  29: 43 */     if (paramArrayOfString[1].equals("clear"))
/*  30:    */     {
/*  31: 44 */       if (localxm.bk().isEmpty()) {
/*  32: 45 */         throw new di("commands.effect.failure.notActive.all", new Object[] { localxm.d_() });
/*  33:    */       }
/*  34: 48 */       localxm.bj();
/*  35: 49 */       a(paramae, this, "commands.effect.success.removed.all", new Object[] { localxm.d_() }); return;
/*  36:    */     }
/*  37:    */     int i;
/*  38:    */     try
/*  39:    */     {
/*  40: 55 */       i = a(paramArrayOfString[1], 1);
/*  41:    */     }
/*  42:    */     catch (dk localdk)
/*  43:    */     {
/*  44: 57 */       wp localwp1 = wp.b(paramArrayOfString[1]);
/*  45: 58 */       if (localwp1 == null) {
/*  46: 59 */         throw localdk;
/*  47:    */       }
/*  48: 61 */       i = localwp1.H;
/*  49:    */     }
/*  50: 64 */     int j = 600;
/*  51: 65 */     int k = 30;
/*  52: 66 */     int m = 0;
/*  53: 68 */     if ((i < 0) || (i >= wp.a.length) || (wp.a[i] == null)) {
/*  54: 69 */       throw new dk("commands.effect.notFound", new Object[] { Integer.valueOf(i) });
/*  55:    */     }
/*  56: 72 */     wp localwp2 = wp.a[i];
/*  57: 73 */     if (paramArrayOfString.length >= 3)
/*  58:    */     {
/*  59: 74 */       k = a(paramArrayOfString[2], 0, 1000000);
/*  60: 75 */       if (localwp2.b()) {
/*  61: 76 */         j = k;
/*  62:    */       } else {
/*  63: 78 */         j = k * 20;
/*  64:    */       }
/*  65:    */     }
/*  66: 80 */     else if (localwp2.b())
/*  67:    */     {
/*  68: 81 */       j = 1;
/*  69:    */     }
/*  70: 84 */     if (paramArrayOfString.length >= 4) {
/*  71: 85 */       m = a(paramArrayOfString[3], 0, 255);
/*  72:    */     }
/*  73: 88 */     boolean bool = true;
/*  74: 89 */     if ((paramArrayOfString.length >= 5) && 
/*  75: 90 */       ("true".equalsIgnoreCase(paramArrayOfString[4]))) {
/*  76: 91 */       bool = false;
/*  77:    */     }
/*  78: 95 */     if (k > 0)
/*  79:    */     {
/*  80: 96 */       wq localwq = new wq(i, j, m, false, bool);
/*  81: 97 */       localxm.c(localwq);
/*  82: 98 */       a(paramae, this, "commands.effect.success", new Object[] { new hz(localwq.g(), new Object[0]), Integer.valueOf(i), Integer.valueOf(m), localxm.d_(), Integer.valueOf(k) });
/*  83: 99 */       return;
/*  84:    */     }
/*  85:102 */     if (localxm.k(i))
/*  86:    */     {
/*  87:103 */       localxm.m(i);
/*  88:104 */       a(paramae, this, "commands.effect.success.removed", new Object[] { new hz(localwp2.a(), new Object[0]), localxm.d_() });
/*  89:    */     }
/*  90:    */     else
/*  91:    */     {
/*  92:106 */       throw new di("commands.effect.failure.notActive", new Object[] { new hz(localwp2.a(), new Object[0]), localxm.d_() });
/*  93:    */     }
/*  94:    */   }
/*  95:    */   
/*  96:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/*  97:    */   {
/*  98:113 */     if (paramArrayOfString.length == 1) {
/*  99:114 */       return a(paramArrayOfString, d());
/* 100:    */     }
/* 101:116 */     if (paramArrayOfString.length == 2) {
/* 102:117 */       return a(paramArrayOfString, wp.c());
/* 103:    */     }
/* 104:119 */     if (paramArrayOfString.length == 5) {
/* 105:120 */       return a(paramArrayOfString, new String[] { "true", "false" });
/* 106:    */     }
/* 107:123 */     return null;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected String[] d()
/* 111:    */   {
/* 112:127 */     return MinecraftServer.M().I();
/* 113:    */   }
/* 114:    */   
/* 115:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 116:    */   {
/* 117:132 */     return paramInt == 0;
/* 118:    */   }
/* 119:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bg
 * JD-Core Version:    0.7.0.1
 */