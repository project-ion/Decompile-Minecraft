/*  1:   */ import com.mojang.authlib.GameProfile;
/*  2:   */ import com.mojang.authlib.properties.Property;
/*  3:   */ import com.mojang.authlib.properties.PropertyMap;
/*  4:   */ import java.util.UUID;
/*  5:   */ 
/*  6:   */ public final class ga
/*  7:   */ {
/*  8:   */   public static GameProfile a(fn paramfn)
/*  9:   */   {
/* 10:16 */     String str1 = null;
/* 11:17 */     String str2 = null;
/* 12:19 */     if (paramfn.b("Name", 8)) {
/* 13:20 */       str1 = paramfn.j("Name");
/* 14:   */     }
/* 15:22 */     if (paramfn.b("Id", 8)) {
/* 16:23 */       str2 = paramfn.j("Id");
/* 17:   */     }
/* 18:26 */     if ((!vb.b(str1)) || (!vb.b(str2)))
/* 19:   */     {
/* 20:   */       UUID localUUID;
/* 21:   */       try
/* 22:   */       {
/* 23:29 */         localUUID = UUID.fromString(str2);
/* 24:   */       }
/* 25:   */       catch (Throwable localThrowable)
/* 26:   */       {
/* 27:31 */         localUUID = null;
/* 28:   */       }
/* 29:33 */       GameProfile localGameProfile = new GameProfile(localUUID, str1);
/* 30:   */       fn localfn1;
/* 31:35 */       if (paramfn.b("Properties", 10))
/* 32:   */       {
/* 33:36 */         localfn1 = paramfn.m("Properties");
/* 34:38 */         for (String str3 : localfn1.c())
/* 35:   */         {
/* 36:39 */           fv localfv = localfn1.c(str3, 10);
/* 37:40 */           for (int i = 0; i < localfv.c(); i++)
/* 38:   */           {
/* 39:41 */             fn localfn2 = localfv.b(i);
/* 40:42 */             String str4 = localfn2.j("Value");
/* 41:44 */             if (localfn2.b("Signature", 8)) {
/* 42:45 */               localGameProfile.getProperties().put(str3, new Property(str3, str4, localfn2.j("Signature")));
/* 43:   */             } else {
/* 44:47 */               localGameProfile.getProperties().put(str3, new Property(str3, str4));
/* 45:   */             }
/* 46:   */           }
/* 47:   */         }
/* 48:   */       }
/* 49:53 */       return localGameProfile;
/* 50:   */     }
/* 51:55 */     return null;
/* 52:   */   }
/* 53:   */   
/* 54:   */   public static fn a(fn paramfn, GameProfile paramGameProfile)
/* 55:   */   {
/* 56:59 */     if (!vb.b(paramGameProfile.getName())) {
/* 57:60 */       paramfn.a("Name", paramGameProfile.getName());
/* 58:   */     }
/* 59:62 */     if (paramGameProfile.getId() != null) {
/* 60:63 */       paramfn.a("Id", paramGameProfile.getId().toString());
/* 61:   */     }
/* 62:65 */     if (!paramGameProfile.getProperties().isEmpty())
/* 63:   */     {
/* 64:66 */       fn localfn1 = new fn();
/* 65:67 */       for (String str : paramGameProfile.getProperties().keySet())
/* 66:   */       {
/* 67:68 */         fv localfv = new fv();
/* 68:69 */         for (Property localProperty : paramGameProfile.getProperties().get(str))
/* 69:   */         {
/* 70:70 */           fn localfn2 = new fn();
/* 71:71 */           localfn2.a("Value", localProperty.getValue());
/* 72:72 */           if (localProperty.hasSignature()) {
/* 73:73 */             localfn2.a("Signature", localProperty.getSignature());
/* 74:   */           }
/* 75:75 */           localfv.a(localfn2);
/* 76:   */         }
/* 77:77 */         localfn1.a(str, localfv);
/* 78:   */       }
/* 79:79 */       paramfn.a("Properties", localfn1);
/* 80:   */     }
/* 81:82 */     return paramfn;
/* 82:   */   }
/* 83:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ga
 * JD-Core Version:    0.7.0.1
 */