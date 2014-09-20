/*   1:    */ import java.util.EnumSet;
/*   2:    */ import java.util.List;
/*   3:    */ import java.util.Set;
/*   4:    */ import net.minecraft.server.MinecraftServer;
/*   5:    */ 
/*   6:    */ public class cw
/*   7:    */   extends z
/*   8:    */ {
/*   9:    */   public String c()
/*  10:    */   {
/*  11: 22 */     return "tp";
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int a()
/*  15:    */   {
/*  16: 27 */     return 2;
/*  17:    */   }
/*  18:    */   
/*  19:    */   public String c(ae paramae)
/*  20:    */   {
/*  21: 32 */     return "commands.tp.usage";
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void a(ae paramae, String[] paramArrayOfString)
/*  25:    */   {
/*  26: 37 */     if (paramArrayOfString.length < 1) {
/*  27: 38 */       throw new dp("commands.tp.usage", new Object[0]);
/*  28:    */     }
/*  29: 41 */     wv localwv1 = 0;
/*  30:    */     Object localObject;
/*  31: 43 */     if ((paramArrayOfString.length == 2) || (paramArrayOfString.length == 4) || (paramArrayOfString.length == 6))
/*  32:    */     {
/*  33: 44 */       localObject = b(paramae, paramArrayOfString[0]);
/*  34: 45 */       localwv1 = 1;
/*  35:    */     }
/*  36:    */     else
/*  37:    */     {
/*  38: 47 */       localObject = b(paramae);
/*  39:    */     }
/*  40: 50 */     if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2))
/*  41:    */     {
/*  42: 51 */       localwv2 = b(paramae, paramArrayOfString[(paramArrayOfString.length - 1)]);
/*  43: 52 */       if (localwv2.o != ((wv)localObject).o) {
/*  44: 53 */         throw new di("commands.tp.notSameDimension", new Object[0]);
/*  45:    */       }
/*  46: 56 */       ((wv)localObject).a(null);
/*  47: 57 */       if ((localObject instanceof qw)) {
/*  48: 58 */         ((qw)localObject).a.a(localwv2.s, localwv2.t, localwv2.u, localwv2.y, localwv2.z);
/*  49:    */       } else {
/*  50: 60 */         ((wv)localObject).b(localwv2.s, localwv2.t, localwv2.u, localwv2.y, localwv2.z);
/*  51:    */       }
/*  52: 62 */       a(paramae, this, "commands.tp.success", new Object[] { ((wv)localObject).d_(), localwv2.d_() });
/*  53: 63 */       return;
/*  54:    */     }
/*  55: 66 */     if (paramArrayOfString.length < localwv1 + 3) {
/*  56: 67 */       throw new dp("commands.tp.usage", new Object[0]);
/*  57:    */     }
/*  58: 70 */     if (((wv)localObject).o == null) {
/*  59: 71 */       return;
/*  60:    */     }
/*  61: 74 */     wv localwv2 = localwv1;
/*  62: 75 */     aa localaa1 = a(((wv)localObject).s, paramArrayOfString[(localwv2++)], true);
/*  63: 76 */     aa localaa2 = a(((wv)localObject).t, paramArrayOfString[(localwv2++)], 0, 0, false);
/*  64: 77 */     aa localaa3 = a(((wv)localObject).u, paramArrayOfString[(localwv2++)], true);
/*  65: 78 */     aa localaa4 = a(((wv)localObject).y, paramArrayOfString.length > localwv2 ? paramArrayOfString[(localwv2++)] : "~", false);
/*  66: 79 */     aa localaa5 = a(((wv)localObject).z, paramArrayOfString.length > localwv2 ? paramArrayOfString[localwv2] : "~", false);
/*  67:    */     float f2;
/*  68: 81 */     if ((localObject instanceof qw))
/*  69:    */     {
/*  70: 82 */       EnumSet localEnumSet = EnumSet.noneOf(ij.class);
/*  71: 84 */       if (localaa1.c()) {
/*  72: 85 */         localEnumSet.add(ij.a);
/*  73:    */       }
/*  74: 87 */       if (localaa2.c()) {
/*  75: 88 */         localEnumSet.add(ij.b);
/*  76:    */       }
/*  77: 90 */       if (localaa3.c()) {
/*  78: 91 */         localEnumSet.add(ij.c);
/*  79:    */       }
/*  80: 93 */       if (localaa5.c()) {
/*  81: 94 */         localEnumSet.add(ij.e);
/*  82:    */       }
/*  83: 96 */       if (localaa4.c()) {
/*  84: 97 */         localEnumSet.add(ij.d);
/*  85:    */       }
/*  86:100 */       f2 = (float)localaa4.b();
/*  87:101 */       if (!localaa4.c()) {
/*  88:102 */         f2 = uv.g(f2);
/*  89:    */       }
/*  90:104 */       float f3 = (float)localaa5.b();
/*  91:105 */       if (!localaa5.c()) {
/*  92:106 */         f3 = uv.g(f3);
/*  93:    */       }
/*  94:110 */       if ((f3 > 90.0F) || (f3 < -90.0F))
/*  95:    */       {
/*  96:111 */         f3 = uv.g(180.0F - f3);
/*  97:112 */         f2 = uv.g(f2 + 180.0F);
/*  98:    */       }
/*  99:115 */       ((wv)localObject).a(null);
/* 100:116 */       ((qw)localObject).a.a(localaa1.b(), localaa2.b(), localaa3.b(), f2, f3, localEnumSet);
/* 101:117 */       ((wv)localObject).f(f2);
/* 102:    */     }
/* 103:    */     else
/* 104:    */     {
/* 105:119 */       float f1 = (float)uv.g(localaa4.a());
/* 106:120 */       f2 = (float)uv.g(localaa5.a());
/* 107:123 */       if ((f2 > 90.0F) || (f2 < -90.0F))
/* 108:    */       {
/* 109:124 */         f2 = uv.g(180.0F - f2);
/* 110:125 */         f1 = uv.g(f1 + 180.0F);
/* 111:    */       }
/* 112:128 */       ((wv)localObject).b(localaa1.a(), localaa2.a(), localaa3.a(), f1, f2);
/* 113:129 */       ((wv)localObject).f(f1);
/* 114:    */     }
/* 115:131 */     a(paramae, this, "commands.tp.success.coordinates", new Object[] { ((wv)localObject).d_(), Double.valueOf(localaa1.a()), Double.valueOf(localaa2.a()), Double.valueOf(localaa3.a()) });
/* 116:    */   }
/* 117:    */   
/* 118:    */   public List a(ae paramae, String[] paramArrayOfString, dt paramdt)
/* 119:    */   {
/* 120:137 */     if ((paramArrayOfString.length == 1) || (paramArrayOfString.length == 2)) {
/* 121:138 */       return a(paramArrayOfString, MinecraftServer.M().I());
/* 122:    */     }
/* 123:141 */     return null;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public boolean b(String[] paramArrayOfString, int paramInt)
/* 127:    */   {
/* 128:146 */     return paramInt == 0;
/* 129:    */   }
/* 130:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cw
 * JD-Core Version:    0.7.0.1
 */